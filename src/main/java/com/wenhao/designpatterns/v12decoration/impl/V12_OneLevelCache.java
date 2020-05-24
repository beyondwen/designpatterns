package com.wenhao.designpatterns.v12decoration.impl;

import com.wenhao.designpatterns.v12decoration.V12_CacheService;

/**
 * 原始功能 一级缓存
 */
public class V12_OneLevelCache implements V12_CacheService {
    @Override
    public Object get() {
        System.out.println("一级缓存");
        return "12345";
    }
}
