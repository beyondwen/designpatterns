package com.wenhao.designpatterns.v9.singleton.hungryman;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance(){
        return singleton;
    }
}
