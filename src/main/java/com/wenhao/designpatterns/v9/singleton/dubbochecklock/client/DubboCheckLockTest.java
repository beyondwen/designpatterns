package com.wenhao.designpatterns.v9.singleton.dubbochecklock.client;

import com.wenhao.designpatterns.v9.singleton.dubbochecklock.SingletonV3;

public class DubboCheckLockTest {

    public static void main(String[] args) {
        //懒汉形式双重检验🔒
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            SingletonV3.getInstance());
                }
            }).start();
        }

    }
}
