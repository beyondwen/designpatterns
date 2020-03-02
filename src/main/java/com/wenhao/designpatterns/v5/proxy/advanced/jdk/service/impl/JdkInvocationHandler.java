package com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 目标代理对象
     */
    public Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info(">>>日志收集开始<<<");
        Object result = method.invoke(target, args);
        log.info(">>>日志收集结束<<<");
        return result;
    }

    /**
     * 获取代理对象接口
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
