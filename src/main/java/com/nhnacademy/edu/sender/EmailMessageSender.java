package com.nhnacademy.edu.sender;

import com.nhnacademy.edu.domain.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("Email [%s] - %s\n", user.getEmail(), message);
    }
}
