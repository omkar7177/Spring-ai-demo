package com.spring.ai.demo.service;

import com.spring.ai.demo.entity.Bio;

public interface ChatService {
    Bio chat(String query);
    String chatWithAI(String prompt);
}
