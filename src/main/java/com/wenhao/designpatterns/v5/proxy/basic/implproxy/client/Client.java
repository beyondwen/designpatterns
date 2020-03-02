package com.wenhao.designpatterns.v5.proxy.basic.client;

import com.wenhao.designpatterns.v5.proxy.basic.implproxy.service.OrderService;
import com.wenhao.designpatterns.v5.proxy.basic.implproxy.service.impl.OrderServiceImpl;
import com.wenhao.designpatterns.v5.proxy.basic.implproxy.service.impl.OrderServiceProxy;

public class Client {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.service();
    }
}
