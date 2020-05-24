package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class V11_MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法之前调用");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("方法之后调用");
        return result;
    }
}
