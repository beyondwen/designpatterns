package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.cglib.proxy.MyMethodInterceptor;
import com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.service.V11_PlanService$$EnhancerByCGLIB$$37d88b32;

public class V11_PlanTest {

    public static void main(String[] args) throws Throwable {
        /*System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        V11_MyMethodInterceptor myMethodInterceptor = new V11_MyMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(V11_PlanService.class);
        enhancer.setCallback(myMethodInterceptor);
        V11_PlanService o = (V11_PlanService) enhancer.create();
        o.boarding();*/
        V11_PlanService$$EnhancerByCGLIB$$37d88b32 proxy = new V11_PlanService$$EnhancerByCGLIB$$37d88b32();
        proxy.setCallback(0, new MyMethodInterceptor());
        proxy.boarding();
    }
}
