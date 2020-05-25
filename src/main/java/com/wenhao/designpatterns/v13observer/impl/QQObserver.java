package com.wenhao.designpatterns.v13observer.impl;

import com.wenhao.designpatterns.v13observer.Observer;
import org.springframework.stereotype.Component;

/**
 * 每个具体观察者 实现自己的 方法通知
 */
@Component
public class QQObserver implements Observer {

    @Override
    public void sendMsg() {
        System.out.println(Thread.currentThread().getName()+"QQ通知");
    }
}
