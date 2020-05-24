package com.wenhao.designpatterns.v9.singleton.breaksingleton;

public class SingletonV5 {
    private static SingletonV5 singletonV2;

    private SingletonV5() {

    }

    public static SingletonV5 getInstance() {
        if (singletonV2 == null) {
            try {
                Thread.sleep(200);
                singletonV2 = new SingletonV5();
            } catch (Exception e) {

            }
        }
        return singletonV2;
    }
}


