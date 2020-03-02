package com.wenhao.designpatterns.v6.manualproxy.jdk.customer.impl;

import com.wenhao.designpatterns.v6.manualproxy.jdk.customer.MyExtInvocationHandler;
import com.wenhao.designpatterns.v6.manualproxy.jdk.proxy.$Proxy0;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
public class ExtJdkInvocationHandler implements MyExtInvocationHandler {

    Object target;

    public ExtJdkInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("纯手写JDK动态代理日志拦截开始>>>>>");
        Object result = method.invoke(target, args);
        log.info("纯手写JDK动态代理日志拦截结束>>>>>");
        return result;
    }

    public <T> T getProxy() {
        return (T) new $Proxy0(this);
    }
}
