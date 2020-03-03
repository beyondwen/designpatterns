package com.wenhao.designpatterns.v7.observer.basic.subject.impl;

import com.wenhao.designpatterns.v7.observer.basic.observer.AbstractObserver;
import com.wenhao.designpatterns.v7.observer.basic.subject.AbstractSubject;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WeChatSubject implements AbstractSubject {

    List<AbstractObserver> observers = new ArrayList<>();

    String message;

    @Override
    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void noticeObserver(String message) {
        for (AbstractObserver observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void noticeMessage(String message) {
        this.message = message;
        log.info("微信公众号设置message:" + message);
        noticeObserver(message);
    }
}
