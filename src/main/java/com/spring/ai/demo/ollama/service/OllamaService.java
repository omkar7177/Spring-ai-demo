package com.spring.ai.demo.ollama.service;

import com.spring.ai.demo.entity.Bio;

public interface OllamaService {
    Bio getChat(String prompt);
}
