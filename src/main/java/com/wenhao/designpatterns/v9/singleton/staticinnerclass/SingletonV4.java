package com.wenhao.designpatterns.v9.singleton.staticinnerclass;

public class SingletonV4 {

    public static SingletonV4 getInstance() {
        return SingletonStatic.singletonV4;
    }

    static class SingletonStatic {
        private static final SingletonV4 singletonV4 = new SingletonV4();
    }

    public static void main(String[] args) {
        SingletonV4 instance1 = SingletonV4.getInstance();
        SingletonV4 instance2 = SingletonV4.getInstance();
        System.out.println(instance1 == instance2);
    }
}
