package com.nhnacademy.edu.service;

import com.nhnacademy.edu.domain.User;
import com.nhnacademy.edu.sender.MessageSender;

public class MessageSendService {

    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendService(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
