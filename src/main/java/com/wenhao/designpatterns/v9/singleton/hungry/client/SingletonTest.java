package com.wenhao.designpatterns.v9.singleton.hungry.client;

import com.wenhao.designpatterns.v9.singleton.hungry.SingletonV1;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonV1 singleton1 = SingletonV1.getInstance();
        SingletonV1 singleton2 = SingletonV1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
