package com.wenhao.designpatterns.v13observer.impl;

import com.wenhao.designpatterns.v13observer.Observer;
import org.springframework.stereotype.Component;

@Component
public class QQObserver implements Observer {

    @Override
    public void sendMsg() {
        System.out.println(Thread.currentThread().getName()+"QQ通知");
    }
}
