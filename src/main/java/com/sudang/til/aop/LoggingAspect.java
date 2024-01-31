package com.sudang.til.aop;

import com.sudang.til.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(public * com.sudang.til.sender.MessageSender.sendMessage(..)))")
    private void sendMessagePointCut() {}

    @Around("com.sudang.til.aop.LoggingAspect.sendMessagePointCut() && args(user, ..)")
    private Object logging(ProceedingJoinPoint joinPoint, User user) throws Throwable {
        user = new User("조작", "jojak@gmail.com", "010-9999-9999");
        Object[] args = new Object[]{user, "조작된 메세지"};

        StopWatch stopWatch = new StopWatch(user.getName());
        stopWatch.start();

        try {
            return joinPoint.proceed(args);
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
