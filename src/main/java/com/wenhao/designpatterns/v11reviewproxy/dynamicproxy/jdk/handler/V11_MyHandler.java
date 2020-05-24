package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class V11_MyHandler implements InvocationHandler {

    /**
     * 被代理类
     */
    private Object target;

    /**
     * 通过构造函数传入 被代理类
     * @param target 被代理类
     */
    public V11_MyHandler(Object target) {
        this.target = target;
    }

    /**
     * 代理类通过 该方法 进行调用
     * @param proxy 代理类
     * @param method 目标方法
     * @param args 目标方法参数
     * @return 返回目标方法 执行结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标方法之前执行");
        //最终调用 native 方法
        Object invoke = method.invoke(target, args);
        System.out.println("目标方法之后执行");
        return invoke;
    }

    /**
     * 获取代理类
     * @param <T> 返回代理类
     * @return 代理类
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
