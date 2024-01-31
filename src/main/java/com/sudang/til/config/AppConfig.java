package com.sudang.til.config;

import com.sudang.til.sender.MessageSender;
import com.sudang.til.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.sudang.til.sender", "com.sudang.til.aop"})
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
