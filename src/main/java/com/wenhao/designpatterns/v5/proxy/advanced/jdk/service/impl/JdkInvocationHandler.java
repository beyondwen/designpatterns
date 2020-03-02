package com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理：jdk会生成一个动态代理类，生成的这个代理类继承 Proxy和实现需要代理的类
 * 该动态类会调用自己实现的jdk动态代理类，在调用时会将自己的代理类和方法以及参数
 * 传入自己实现的jdk代理的invoke方法中
 */
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
