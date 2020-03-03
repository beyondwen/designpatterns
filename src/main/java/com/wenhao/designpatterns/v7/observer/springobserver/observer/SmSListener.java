package com.wenhao.designpatterns.v7.observer.springobserver.observer;

import com.wenhao.designpatterns.v7.observer.springobserver.observable.OrderCreateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmSListener implements ApplicationListener<OrderCreateEvent> {
    @Override
    @Async
    public void onApplicationEvent(OrderCreateEvent event) {
        log.info(Thread.currentThread().getName() + "发送短信内容", event.getJsonObject().toString());
    }
}
