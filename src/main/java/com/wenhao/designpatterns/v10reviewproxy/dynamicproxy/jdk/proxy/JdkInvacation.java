package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvacation implements InvocationHandler {
    /**
     * 目标类
     */
    private Object target;

    public JdkInvacation(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理类
     * @param method 目标方法
     * @param args 目标方法参数
     * @return 返回执行结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标方法之前执行");
        //传入目标类 和 目标方法参数
        Object result = method.invoke(target, args);
        System.out.println("目标方法之后执行");
        return result;
    }

    /**
     * 获取代理类
     * @param <T> 代理类
     * @return 代理类
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
