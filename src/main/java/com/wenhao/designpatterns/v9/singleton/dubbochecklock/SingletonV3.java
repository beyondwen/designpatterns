package com.wenhao.designpatterns.v9.singleton.dubbochecklock;

public class SingletonV3 {

    private static SingletonV3 singletonV3;

    private SingletonV3() {

    }

    /**
     * 双重校验同步🔒
     *
     * @return SingletonV3
     */
    public static SingletonV3 getInstance() {
        if (singletonV3 == null) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (SingletonV3.class) {
                if (singletonV3 == null) {
                    singletonV3 = new SingletonV3();
                }
            }
        }
        return singletonV3;
    }
}
