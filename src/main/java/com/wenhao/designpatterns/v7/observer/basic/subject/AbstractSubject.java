package com.wenhao.designpatterns.v7.observer.basic.subject;

import com.wenhao.designpatterns.v7.observer.basic.observer.AbstractObserver;

public interface AbstractSubject {

    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    void addObserver(AbstractObserver observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(AbstractObserver observer);

    /**
     * 通知观察者
     *
     * @param message 消息
     */
    void noticeObserver(String message);

    /**
     * 设置通知内容
     *
     * @param message
     */
    void noticeMessage(String message);
}
