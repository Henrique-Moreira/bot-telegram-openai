package com.iftm.bottelegramopenai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.iftm.bottelegramopenai.dto.ChatGPTRequest;
import com.iftm.bottelegramopenai.dto.ChatGPTResponse;
import com.iftm.bottelegramopenai.dto.Message;

@Service
public class OpenAiService {
    
    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @Value("${openai.api.key}")
    private String apiKey;

    public ChatGPTResponse chat(List<Message> messages) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        ChatGPTRequest request = new ChatGPTRequest(model, messages);

        HttpEntity entity = new HttpEntity<>(request, headers);

        try {
            return restTemplate.postForObject(apiUrl, entity, ChatGPTResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
