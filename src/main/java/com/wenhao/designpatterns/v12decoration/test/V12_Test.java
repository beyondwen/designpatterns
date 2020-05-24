package com.wenhao.designpatterns.v12decoration.test;

import com.wenhao.designpatterns.v12decoration.expand.V12_TwoCacheService;
import com.wenhao.designpatterns.v12decoration.impl.V12_OneLevelCache;

public class V12_Test {

    public static void main(String[] args) {
        V12_TwoCacheService v12_twoCacheService = new V12_TwoCacheService(new V12_OneLevelCache());
        Object o = v12_twoCacheService.get();
        System.out.println(o);
    }
}
