package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvacation implements InvocationHandler {
    private Object target;

    public JdkInvacation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标方法之前执行");
        Object result = method.invoke(target, args);
        System.out.println("目标方法之后执行");
        return result;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
