// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 2020/5/20 16:09:17
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   <generated>

package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.service;

import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// Referenced classes of package com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.service:
//            ServenUserService

public class ServenUserService$$EnhancerByCGLIB$$66238d68 extends ServenUserService {

    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        Method amethod[];
        Method amethod1[];
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class class1 = Class.forName("com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.service.ServenUserService$$EnhancerByCGLIB$$66238d68");
        Class class2;
        amethod = ReflectUtils.findMethods(new String[]{
                "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"
        }, (class2 = Class.forName("java.lang.Object")).getDeclaredMethods());
        Method[] _tmp = amethod;
        CGLIB$equals$1$Method = amethod[0];
        CGLIB$equals$1$Proxy = MethodProxy.create(class2, class1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
        CGLIB$toString$2$Method = amethod[1];
        CGLIB$toString$2$Proxy = MethodProxy.create(class2, class1, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
        CGLIB$hashCode$3$Method = amethod[2];
        CGLIB$hashCode$3$Proxy = MethodProxy.create(class2, class1, "()I", "hashCode", "CGLIB$hashCode$3");
        CGLIB$clone$4$Method = amethod[3];
        CGLIB$clone$4$Proxy = MethodProxy.create(class2, class1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
        amethod1 = ReflectUtils.findMethods(new String[]{
                "add", "()V"
        }, (class2 = Class.forName("com.wenhao.designpatterns.v10reviewproxy.dynamicproxy.sevencglib.service.ServenUserService")).getDeclaredMethods());
        Method[] _tmp1 = amethod1;
        CGLIB$add$0$Method = amethod1[0];
        CGLIB$add$0$Proxy = MethodProxy.create(class2, class1, "()V", "add", "CGLIB$add$0");
    }

    final void CGLIB$add$0() {
        super.add();
    }

    public final void add() {
        CGLIB$CALLBACK_0 = this.CGLIB$CALLBACK_0;
        if (CGLIB$CALLBACK_0 != null) {
            CGLIB$BIND_CALLBACKS(this);
        }
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        try {
            if (methodInterceptor != null) {
                methodInterceptor.intercept(this, CGLIB$add$0$Method, CGLIB$emptyArgs, CGLIB$add$0$Proxy);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        super.add();
    }

    final boolean CGLIB$equals$1(Object obj) {
        return super.equals(obj);
    }


    public static void CGLIB$SET_THREAD_CALLBACKS(Callback acallback[]) {
        CGLIB$THREAD_CALLBACKS.set(acallback);
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback acallback[]) {
        CGLIB$STATIC_CALLBACKS = acallback;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object obj) {

    }

    public Object newInstance(Callback acallback[]) {
        CGLIB$SET_THREAD_CALLBACKS(acallback);
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new ServenUserService$$EnhancerByCGLIB$$66238d68();
    }

    public Object newInstance(Callback callback) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{
                callback
        });
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new ServenUserService$$EnhancerByCGLIB$$66238d68();
    }


    public void setCallbacks(Callback acallback) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor) acallback;
    }

    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return (new Callback[]{
                CGLIB$CALLBACK_0
        });
    }


    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private static Object CGLIB$CALLBACK_FILTER;
    private static Method CGLIB$add$0$Method;
    private static MethodProxy CGLIB$add$0$Proxy;
    private static Object CGLIB$emptyArgs[];
    private static Method CGLIB$equals$1$Method;
    private static MethodProxy CGLIB$equals$1$Proxy;
    private static Method CGLIB$toString$2$Method;
    private static MethodProxy CGLIB$toString$2$Proxy;
    private static Method CGLIB$hashCode$3$Method;
    private static MethodProxy CGLIB$hashCode$3$Proxy;
    private static Method CGLIB$clone$4$Method;
    private static MethodProxy CGLIB$clone$4$Proxy;

    static {
        try {
            CGLIB$STATICHOOK1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ServenUserService$$EnhancerByCGLIB$$66238d68() {
        CGLIB$BIND_CALLBACKS(this);
    }
}
