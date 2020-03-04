package com.wenhao.designpatterns.v9.singleton.hungry.client;

import com.wenhao.designpatterns.v9.singleton.hungry.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
