package com.wenhao.designpatterns.v6.manualproxy.jdk.customer;

import java.lang.reflect.Method;

public interface MyExtInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)throws Throwable;
}
