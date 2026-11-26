package com.spring.ai.demo.ollama.service;

import com.spring.ai.demo.entity.Bio;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.Generation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OllamaServiceImpl implements OllamaService{

    private ChatClient chatClient;

    public OllamaServiceImpl(@Qualifier("ollamaClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public Bio getChat(String prompt) {
        Bio response = chatClient.prompt(prompt)
                .call()
                .entity(Bio.class);
//                .user(prompt)
//                .system("act as a cricket expert")
//                .call()
//                .chatResponse()
//                .getResult()
//                .getOutput()
//                .getText();
        return response;
    }
}
