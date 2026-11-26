package com.spring.ai.demo.ollama.controller;

import com.spring.ai.demo.entity.Bio;
import com.spring.ai.demo.ollama.service.OllamaService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ollama/")
public class OllamaController {

    private OllamaService ollamaService;

    public OllamaController(OllamaService ollamaService) {
        this.ollamaService = ollamaService;
    }

    @GetMapping("/chatWithOllama")
    public ResponseEntity<Bio> chatWithOllama
            (@RequestParam(value = "query")String query){
        System.out.println("Ollama client called from OllamaController class..");
        var response = ollamaService.getChat(query);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/test")
    public String test(){
        return "Ollama is working fine.";
    }
}
