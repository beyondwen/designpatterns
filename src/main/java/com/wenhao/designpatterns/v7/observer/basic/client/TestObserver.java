package com.wenhao.designpatterns.v7.observer.basic.client;

import com.wenhao.designpatterns.v7.observer.basic.observer.impl.UserObserver;
import com.wenhao.designpatterns.v7.observer.basic.subject.AbstractSubject;
import com.wenhao.designpatterns.v7.observer.basic.subject.impl.WeChatSubject;

/**
 * 抽象主题的作用是，定义操作观察者的一系列方法，比如添加，删除观察者，以及更新消息内容，
 * 通知订阅的观察者，
 * 抽象观察者的作用是，接收到主题消息后，可以自定义的进行处理
 */
public class TestObserver {
    public static void main(String[] args) {
        AbstractSubject weChatSubject = new WeChatSubject();
        weChatSubject.addObserver(new UserObserver("张三"));
        weChatSubject.addObserver(new UserObserver("李四"));
        weChatSubject.noticeMessage("每特教育第五期平均就业薪资破3万+");
    }
}
