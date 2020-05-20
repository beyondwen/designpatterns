package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.interceptor.MyInterceptor;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.service.ServenUserService$$EnhancerByCGLIB$$66238d68;

public class SevenCglibTest {

    public static void main(String[] args) {
        /*System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new MyInterceptor());
        enhancer.setSuperclass(ServenUserService.class);
        ServenUserService servenUserService = (ServenUserService) enhancer.create();
        servenUserService.add();*/
        ServenUserService$$EnhancerByCGLIB$$66238d68 te = new ServenUserService$$EnhancerByCGLIB$$66238d68();
        te.setCallbacks(new MyInterceptor());
        te.add();
    }
}
