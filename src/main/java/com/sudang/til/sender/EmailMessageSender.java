package com.sudang.til.sender;

import com.sudang.til.domain.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("Email [%s] - %s\n", user.getEmail(), message);
    }
}
