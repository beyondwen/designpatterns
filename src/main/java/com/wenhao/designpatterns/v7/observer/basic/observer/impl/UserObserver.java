package com.wenhao.designpatterns.v7.observer.basic.observer.impl;

import com.wenhao.designpatterns.v7.observer.basic.observer.AbstractObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserObserver implements AbstractObserver {

    /**
     * 订阅者名称
     */
    private String name;

    /**
     * 发送内容
     */
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        log.info(name + ",老师收到推送消息:" + message);
    }

    public UserObserver(String name) {
        this.name = name;
    }
}
