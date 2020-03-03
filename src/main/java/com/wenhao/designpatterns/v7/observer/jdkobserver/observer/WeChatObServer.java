package com.wenhao.designpatterns.v7.observer.jdkobserver.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class WeChatObServer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        // 1.获取主题
       /* MessageObServable messageObServable = (MessageObServable) o;
        messageObServable.notifyObservers(arg);*/
        log.info("微信通知成功"+arg);
    }
}
