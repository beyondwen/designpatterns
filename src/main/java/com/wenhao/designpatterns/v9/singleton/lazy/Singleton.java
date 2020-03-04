package com.wenhao.designpatterns.v9.singleton.lazy;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            try {
                Thread.sleep(200);
                singleton = new Singleton();
            } catch (Exception e) {

            }
        }
        return singleton;
    }
}


