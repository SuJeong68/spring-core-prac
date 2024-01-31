package com.sudang.til.service;

import com.sudang.til.domain.User;
import com.sudang.til.sender.MessageSender;

public class MessageSendService {

    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendService(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
