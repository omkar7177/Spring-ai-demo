package com.spring.ai.demo.ollama.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OllamaConfig {
    @Bean(name="ollamaClient")
    public ChatClient ollamaClient(OllamaChatModel chatModel){
        return ChatClient.builder(chatModel).build();
    }
}
