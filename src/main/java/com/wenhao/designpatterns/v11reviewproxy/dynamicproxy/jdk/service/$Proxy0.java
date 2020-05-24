package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements V11_CarService {


    private static Method m3;

    public $Proxy0(InvocationHandler paramInvocationHandler) {
        super(paramInvocationHandler);
    }

    public final void sell() {
        try {
            this.h.invoke(this, m3, null);
            return;
        } catch (Error | RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    static {
        try {
            m3 = Class.forName("com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.jdk.service.V11_CarService").getMethod("sell", new Class[0]);
        } catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        } catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }
}
