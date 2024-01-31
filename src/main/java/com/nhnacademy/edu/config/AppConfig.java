package com.nhnacademy.edu.config;

import com.nhnacademy.edu.sender.MessageSender;
import com.nhnacademy.edu.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.nhnacademy.edu.sender", "com.nhnacademy.edu.aop"})
@EnableAspectJAutoProxy
public class AppConfig {

    @Autowired
    @Qualifier("emailMessageSender")
    private MessageSender messageSender;

    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService(messageSender);
    }
}
