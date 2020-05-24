package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service.impl;

import com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service.V11_CarService;

public class V11_CarServiceImpl implements V11_CarService {
    @Override
    public void sell() {
        System.out.println("卖车");
    }
}
