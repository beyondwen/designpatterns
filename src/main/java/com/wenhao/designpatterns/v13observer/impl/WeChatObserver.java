package com.wenhao.designpatterns.v13observer.impl;

import com.wenhao.designpatterns.v13observer.Observer;
import org.springframework.stereotype.Component;

@Component
public class WeChatObserver implements Observer {

    @Override
    public void sendMsg() {
        System.out.println(Thread.currentThread().getName()+"微信通知");
    }
}
