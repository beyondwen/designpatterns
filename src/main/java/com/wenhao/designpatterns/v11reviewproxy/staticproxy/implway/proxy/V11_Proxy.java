package com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.proxy;

import com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.V11_OrderService;

public class V11_Proxy implements V11_OrderService {

    private V11_OrderService v11_orderService;

    public V11_Proxy(V11_OrderService v11_orderService) {
        this.v11_orderService = v11_orderService;
    }

    public void add() {
        System.out.println("方法之前执行");
        v11_orderService.add();
        System.out.println("方法之后执行");
    }
}
