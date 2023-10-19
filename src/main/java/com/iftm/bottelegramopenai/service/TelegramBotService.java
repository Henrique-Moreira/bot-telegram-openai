package com.iftm.bottelegramopenai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.iftm.bottelegramopenai.dto.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@SuppressWarnings("deprecation")
public class TelegramBotService extends TelegramLongPollingBot implements InitializingBean {

    @Value("${telegram.bot.username}")
    private String botUsername;

    @Value("${telegram.bot.token}")
    private String botToken;

    @Autowired
    private OpenAiService openAiService;

    private List<Message> messages = new ArrayList<>();

    public TelegramBotService() {
        // implementar este codigo
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // implementar este codigo
    }

    @Override
    public void onUpdateReceived(Update update) {
        // implementar este codigo
    }

    private SendMessage responder(Update update) {
        // implementar este codigo
        return null;
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }
    
    @Override
    public String getBotToken() {
        return botToken;
    }
}