package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.cglib.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法之前日志打印");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("目标方法之后日志打印");
        return o1;
    }
}
