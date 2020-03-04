package com.wenhao.designpatterns.v9.singleton.hungry;

public class SingletonV1 {

    private static SingletonV1 singletonV1 = new SingletonV1();

    private SingletonV1() {

    }

    public static SingletonV1 getInstance(){
        return singletonV1;
    }
}
