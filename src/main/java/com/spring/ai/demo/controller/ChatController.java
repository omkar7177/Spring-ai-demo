package com.spring.ai.demo.controller;

import com.spring.ai.demo.entity.Bio;
import com.spring.ai.demo.service.ChatService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ai/")
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public ResponseEntity<Bio> chat(
            @RequestParam String query){
        System.out.println("Using Open AI chat client...");
        var result = chatService.chat(query);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/chatWithAI")
    public ResponseEntity<String> chatWithAI(
            @RequestParam(value = "prompt") String prompt)
    {
        String response = chatService.chatWithAI(prompt);
        return ResponseEntity.ok(response);
    }
}
