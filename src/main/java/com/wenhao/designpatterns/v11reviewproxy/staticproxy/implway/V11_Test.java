package com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway;

import com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.impl.V11_OrderServiceImpl;
import com.wenhao.designpatterns.v11reviewproxy.staticproxy.implway.proxy.V11_Proxy;

public class V11_Test {

    public static void main(String[] args) {
        V11_Proxy v11_proxy = new V11_Proxy(new V11_OrderServiceImpl());
        v11_proxy.add();
    }
}
