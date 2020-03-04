package com.wenhao.designpatterns.v9.singleton.lazy.client;

import com.wenhao.designpatterns.v9.singleton.lazy.Singleton;

public class LazySingletonTest {

    public static void main(String[] args) {
        //懒汉形式线程不安全
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + Singleton.getInstance());
                }
            }).start();
        }

    }
}
