package com.sudang.til.service;

import com.sudang.til.custom.SendMethod;
import com.sudang.til.custom.SendMethod.Method;
import com.sudang.til.domain.User;
import com.sudang.til.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {

    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@SendMethod(value = Method.EMAIL) MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendService(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
