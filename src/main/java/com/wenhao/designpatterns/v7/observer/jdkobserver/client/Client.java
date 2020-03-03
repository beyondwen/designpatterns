package com.wenhao.designpatterns.v7.observer.jdkobserver.client;

import com.wenhao.designpatterns.v7.observer.jdkobserver.observable.MessageObServable;
import com.wenhao.designpatterns.v7.observer.jdkobserver.observer.EmailObServer;
import com.wenhao.designpatterns.v7.observer.jdkobserver.observer.SmsObServer;
import com.wenhao.designpatterns.v7.observer.jdkobserver.observer.WeChatObServer;

public class Client {

    public static void main(String[] args) {
        MessageObServable messageObServable = new MessageObServable();
        messageObServable.addObserver(new EmailObServer());
        messageObServable.addObserver(new SmsObServer());
        messageObServable.addObserver(new WeChatObServer());
        messageObServable.notifyObservers("今天天气不错哦");
    }
}
