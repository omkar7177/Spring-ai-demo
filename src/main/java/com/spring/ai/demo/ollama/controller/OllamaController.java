package com.spring.ai.demo.ollama.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ollama/")
public class OllamaController {

    private ChatClient chatClient;

    public OllamaController(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }
    @GetMapping("/chatWithOllama")
    public ResponseEntity<String> chatWithOllama
            (@RequestParam(value = "query")String query){
        String response = chatClient.prompt(query).call().content();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/test")
    public String test(){
        return "Ollama is working fine.";
    }
}
