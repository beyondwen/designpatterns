package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.cglib;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.cglib.proxy.MyMethodInterceptor;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.cglib.service.impl.CglibUserServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibUserServiceImpl.class);
        enhancer.setCallback(myMethodInterceptor);
        CglibUserServiceImpl cglibUserService = (CglibUserServiceImpl) enhancer.create();
        cglibUserService.add();
    }
}
