package com.sudang.til.service;

import com.sudang.til.domain.User;
import com.sudang.til.sender.MessageSender;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {

    private final List<MessageSender> messageSenders;

    @Autowired
    public MessageSendService(List<MessageSender> messageSenders) {
        this.messageSenders = messageSenders;
    }

    public void doSendService(User user, String message) {
        for (MessageSender messageSender : messageSenders) {
            messageSender.sendMessage(user, message);
        }
    }
}
