package com.nhnacademy.edu.sender;

import com.nhnacademy.edu.domain.User;

public interface MessageSender {
    void sendMessage(User user, String message);
}
