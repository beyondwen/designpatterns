package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.proxy.JdkInvacation;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.UserService;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.impl.UserServiceImpl;

public class test {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService proxy = new JdkInvacation(new UserServiceImpl()).getProxy();
        proxy.add();
    }
}
