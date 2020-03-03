package com.wenhao.designpatterns.v7.observer.jdkobserver.observable;

import java.util.Observable;

public class MessageObServable extends Observable {
    @Override
    public void notifyObservers(Object arg) {
        // 1.改变数据
        setChanged();
        // 2.通知所有的观察者改变
        super.notifyObservers(arg);
    }
}
