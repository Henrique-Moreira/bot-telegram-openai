package com.iftm.bottelegramopenai.dto;

import java.util.List;

import lombok.Data;

@Data
public class ChatGPTResponse {
    
    private List<Choice> choices;

    @Data
    public static class Choice {
        private int index;
        private Message message;
    }
}
