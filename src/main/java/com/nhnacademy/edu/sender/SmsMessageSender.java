package com.nhnacademy.edu.sender;

import com.nhnacademy.edu.domain.User;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("SMS [%s] - %s\n", user.getPhoneNumber(), message);
    }
}
