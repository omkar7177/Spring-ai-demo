package com.spring.ai.demo.service;

import com.spring.ai.demo.entity.Bio;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatClient openAiChatClient;
    private ChatClient ollamaChatClient;

    public ChatServiceImpl(@Qualifier("openAiChatClient") ChatClient openAiChatClient, @Qualifier("ollamaChatClient") ChatClient ollamaChatClient) {
        this.openAiChatClient = openAiChatClient;
        this.ollamaChatClient = ollamaChatClient;
    }

    @Override
    public Bio chat(String query) {
        return this.openAiChatClient.prompt(query).call().entity(Bio.class);
    }

    @Override
    public String chatWithAI(String prompt) {
        Prompt p = new Prompt(prompt);
        String queryStr = "As an expert in coding and programming. Always write a code in Java. Now reply for this question:{prompt}";
        return openAiChatClient.prompt()
                .user(e->e.text(queryStr).param("prompt",prompt))
//                .system()
                .call().content();
    }
}
