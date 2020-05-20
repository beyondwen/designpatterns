package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法之前进行执行");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("目标方法之后进行执行");
        return result;
    }
}
