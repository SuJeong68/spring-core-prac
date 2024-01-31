package com.sudang.til.sender;

import com.sudang.til.domain.User;

public interface MessageSender {
    void sendMessage(User user, String message);
}
