//package com.spring.ai.demo.controller;
//
//import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api/ai/")
//public class ChatController {
//
//    private ChatClient chatClient;
//
//    public ChatController(ChatClient.Builder builder){
//            this.chatClient=builder.build();
//    }
//
//    @GetMapping("/chat")
//    public ResponseEntity<String> chat(
//            @RequestParam String query){
//
//        var result = chatClient.prompt(query).call().content();
//        return ResponseEntity.ok(result);
//    }
//}
