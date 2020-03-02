package com.wenhao.designpatterns.v5.proxy.advanced.cglib.service;


import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        log.info("日志收集开始");
        Object result = proxy.invokeSuper(o, objects);
        log.info("日志收集结束");
        return result;
    }
}
