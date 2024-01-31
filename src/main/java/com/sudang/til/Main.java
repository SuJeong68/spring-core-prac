package com.sudang.til;

import com.sudang.til.domain.User;
import com.sudang.til.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.config");

        User user = new User("이수정", "ssudangl68@gmail.com", "010-0000-0000");

        context.getBean("messageSendService", MessageSendService.class).doSendService(user, "Hi");
    }
}
