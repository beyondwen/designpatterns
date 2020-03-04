package com.wenhao.designpatterns.v9.singleton.lazy;

public class SingletonV2 {
    private static SingletonV2 singletonV2;

    private SingletonV2() {

    }

    public static SingletonV2 getInstance() {
        if (singletonV2 == null) {
            try {
                Thread.sleep(200);
                singletonV2 = new SingletonV2();
            } catch (Exception e) {

            }
        }
        return singletonV2;
    }
}


