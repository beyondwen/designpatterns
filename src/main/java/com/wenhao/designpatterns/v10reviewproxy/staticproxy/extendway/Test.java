package com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway;

import com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway.proxy.OrderServiceProxy;

public class Test {

    public static void main(String[] args) {
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy();
        orderServiceProxy.add();
    }
}
