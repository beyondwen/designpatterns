package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.impl;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }
}
