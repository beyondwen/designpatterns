package com.wenhao.designpatterns.v11reviewproxy.staticproxy.extendway.proxy;

import com.wenhao.designpatterns.v11reviewproxy.staticproxy.extendway.V11_UserService;

public class V11_Proxy extends V11_UserService {

    @Override
    public void add() {
        System.out.println("方法之前执行");
        super.add();
        System.out.println("方法之后执行");
    }
}
