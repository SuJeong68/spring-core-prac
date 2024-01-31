package com.sudang.til.sender.impl;

import com.sudang.til.domain.User;
import com.sudang.til.sender.MessageSender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void init() {
        System.out.println("EmailMessageSender initialized...");
    }

    @Override
    public void cleanup() {
        System.out.println("EmailMessageSender destroyed...");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("Email [%s] - %s\n", user.getEmail(), message);
    }
}
