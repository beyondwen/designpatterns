package com.wenhao.designpatterns.v9.singleton.breaksingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class V5Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<SingletonV5> instance1 = SingletonV5.class.getDeclaredConstructor();
        instance1.setAccessible(true);
        SingletonV5 singletonV5 = instance1.newInstance();
        SingletonV5 instance = SingletonV5.getInstance();
        System.out.println(instance == singletonV5);
    }
}
