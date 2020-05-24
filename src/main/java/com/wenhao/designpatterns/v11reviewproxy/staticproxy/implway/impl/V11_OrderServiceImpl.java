package com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.impl;

import com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.V11_OrderService;

public class V11_OrderServiceImpl implements V11_OrderService {

    @Override
    public void add() {
        System.out.println("订单添加");
    }
}
