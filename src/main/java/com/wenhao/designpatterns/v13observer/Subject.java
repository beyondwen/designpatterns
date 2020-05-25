package com.wenhao.designpatterns.v13observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class Subject {

    /**
     * 定义线程池
     */
    private ExecutorService executorService;

    /**
     * 定义 存放观察者对象 list
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 初始化 线程池数量
     */
    public Subject() {
        this.executorService = Executors.newFixedThreadPool(10);
    }

    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 异步消息通知
     */
    public void notifyMsg() {
        for (Observer observer : observers) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    observer.sendMsg();
                }
            });
        }
    }
}
