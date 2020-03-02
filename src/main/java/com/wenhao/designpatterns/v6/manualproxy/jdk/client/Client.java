package com.wenhao.designpatterns.v6.manualproxy.jdk.client;

import com.wenhao.designpatterns.v6.manualproxy.jdk.customer.impl.ExtJdkInvocationHandler;
import com.wenhao.designpatterns.v6.manualproxy.jdk.service.OrderService;
import com.wenhao.designpatterns.v6.manualproxy.jdk.service.OrderServiceImpl;

public class Client {

    public static void main(String[] args) throws Throwable {
        ExtJdkInvocationHandler handler = new ExtJdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = handler.getProxy();
        proxy.order();
    }
}
