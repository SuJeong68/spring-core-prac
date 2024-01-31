package com.sudang.til.sender.impl;

import com.sudang.til.domain.User;
import com.sudang.til.sender.MessageSender;

public class SmsMessageSender implements MessageSender {

    @Override
    public void init() {
        System.out.println("SmsMessageSender initialized...");
    }

    @Override
    public void cleanup() {
        System.out.println("SmsMessageSender destroyed...");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("SMS [%s] - %s\n", user.getPhoneNumber(), message);
    }
}
