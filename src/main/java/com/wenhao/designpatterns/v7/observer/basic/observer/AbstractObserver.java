package com.wenhao.designpatterns.v7.observer.basic.observer;

/**
 * 抽象观察者
 */
public interface AbstractObserver {

    /**
     * 更新消息内容
     *
     * @param message 消息
     */
    void update(String message);

}
