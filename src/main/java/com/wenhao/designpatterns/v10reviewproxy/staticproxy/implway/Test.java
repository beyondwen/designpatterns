package com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway;

import com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway.proxy.OrderServiceProxy;
import com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway.service.OrderService;
import com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway.service.impl.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {

        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.add();
    }
}
