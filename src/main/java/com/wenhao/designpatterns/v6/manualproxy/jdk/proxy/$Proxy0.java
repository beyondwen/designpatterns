package com.wenhao.designpatterns.v6.manualproxy.jdk.proxy;

import com.wenhao.designpatterns.v6.manualproxy.jdk.customer.MyExtInvocationHandler;
import com.wenhao.designpatterns.v6.manualproxy.jdk.service.OrderService;

import java.lang.reflect.Method;

public class $Proxy0 implements OrderService {

    private MyExtInvocationHandler h;

    public $Proxy0(MyExtInvocationHandler invocationHandler) {
        this.h = invocationHandler;
    }

    @Override
    public void order() throws Throwable {
      Method method =  OrderService.class.getMethod("order", new Class[]{});
      this.h.invoke(this,method,null);
    }
}
