package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk;

import com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.handler.V11_MyHandler;
import com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service.V11_CarService;
import com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service.impl.V11_CarServiceImpl;

public class V11_001Test {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        V11_MyHandler v11_myHandler = new V11_MyHandler(new V11_CarServiceImpl());
        V11_CarService proxy = v11_myHandler.getProxy();
        proxy.sell();
        /*$Proxy0 proxy = new $Proxy0(new V11_MyHandler(new V11_CarServiceImpl()));
        proxy.sell();*/
    }
}
