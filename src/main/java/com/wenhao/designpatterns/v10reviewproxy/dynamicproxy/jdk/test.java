package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk;

import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.proxy.JdkInvacation;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.$Proxy0;
import com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.impl.UserServiceImpl;

public class test {

    public static void main(String[] args) {
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        /*JdkInvacation jdkInvacation = new JdkInvacation(new UserServiceImpl());
        UserService proxy = jdkInvacation.getProxy();
        proxy.add();*/
        $Proxy0 proxy = new $Proxy0(new JdkInvacation(new UserServiceImpl()));
        proxy.add();
    }
}
