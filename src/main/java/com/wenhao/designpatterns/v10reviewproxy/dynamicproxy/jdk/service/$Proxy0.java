// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 2020/5/20 17:13:17
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy
        implements UserService {

    public $Proxy0(InvocationHandler invocationhandler) {
        super(invocationhandler);
    }


    public final void add() {
        try {
            super.h.invoke(this, m3, null);
            return;
        } catch (Error _ex) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }


    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{
                    Class.forName("java.lang.Object")
            });
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m3 = Class.forName("com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.jdk.service.UserService").getMethod("add", new Class[0]);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
        } catch (NoSuchMethodException nosuchmethodexception) {
            throw new NoSuchMethodError(nosuchmethodexception.getMessage());
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
