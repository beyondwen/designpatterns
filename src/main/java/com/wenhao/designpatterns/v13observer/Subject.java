package com.wenhao.designpatterns.v13observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class Subject {

    private ExecutorService executorService;

    private List<Observer> observers = new ArrayList<>();

    public Subject() {
        this.executorService = Executors.newFixedThreadPool(10);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

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
