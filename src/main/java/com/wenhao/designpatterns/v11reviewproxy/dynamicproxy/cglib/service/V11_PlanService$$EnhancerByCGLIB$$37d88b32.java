package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.service;

import lombok.SneakyThrows;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/* compiled from: <generated> */
public class V11_PlanService$$EnhancerByCGLIB$$37d88b32 extends V11_PlanService implements Factory {
    private static Object CGLIB$CALLBACK_FILTER;
    public static Object CGLIB$FACTORY_DATA;
    private static  Callback[] CGLIB$STATIC_CALLBACKS = null;
    private static ThreadLocal CGLIB$THREAD_CALLBACKS = null;
    private static  Method CGLIB$boarding$0$Method = null;
    private static  MethodProxy CGLIB$boarding$0$Proxy = null;
    private static  Method CGLIB$clone$4$Method = null;
    private static  MethodProxy CGLIB$clone$4$Proxy = null;
    private static Object[] CGLIB$emptyArgs = null;
    private static  Method CGLIB$equals$1$Method = null;
    private static  MethodProxy CGLIB$equals$1$Proxy = null;
    private static  Method CGLIB$hashCode$3$Method = null;
    private static  MethodProxy CGLIB$hashCode$3$Proxy = null;
    private static  Method CGLIB$toString$2$Method = null;
    private static  MethodProxy CGLIB$toString$2$Proxy = null;
    private boolean CGLIB$BOUND;
    private MethodInterceptor CGLIB$CALLBACK_0;

    static {
        try {
            CGLIB$STATICHOOK1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public V11_PlanService$$EnhancerByCGLIB$$37d88b32() {
        CGLIB$BIND_CALLBACKS(this);
    }

    private static final void CGLIB$BIND_CALLBACKS(Object obj) {
        V11_PlanService$$EnhancerByCGLIB$$37d88b32 v11_PlanService$$EnhancerByCGLIB$$37d88b32 = (V11_PlanService$$EnhancerByCGLIB$$37d88b32) obj;
        if (!v11_PlanService$$EnhancerByCGLIB$$37d88b32.CGLIB$BOUND) {
            v11_PlanService$$EnhancerByCGLIB$$37d88b32.CGLIB$BOUND = true;
            Object obj2 = CGLIB$THREAD_CALLBACKS.get();
            if (obj2 == null) {
                obj2 = CGLIB$STATIC_CALLBACKS;
                if (obj2 == null) {
                    return;
                }
            }
            v11_PlanService$$EnhancerByCGLIB$$37d88b32.CGLIB$CALLBACK_0 = (MethodInterceptor) ((Callback[]) obj2)[0];
        }
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] callbackArr) {
        CGLIB$STATIC_CALLBACKS = callbackArr;
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] callbackArr) {
        CGLIB$THREAD_CALLBACKS.set(callbackArr);
    }

    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class cls = Class.forName("com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.service.V11_PlanService$$EnhancerByCGLIB$$37d88b32");
        String[] strArr = new String[]{"equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"};
        Class cls2 = Class.forName("java.lang.Object");
        Method[] findMethods = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods());
        CGLIB$equals$1$Method = findMethods[0];
        CGLIB$equals$1$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
        CGLIB$toString$2$Method = findMethods[1];
        CGLIB$toString$2$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
        CGLIB$hashCode$3$Method = findMethods[2];
        CGLIB$hashCode$3$Proxy = MethodProxy.create(cls2, cls, "()I", "hashCode", "CGLIB$hashCode$3");
        CGLIB$clone$4$Method = findMethods[3];
        CGLIB$clone$4$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
        strArr = new String[]{"boarding", "()V"};
        cls2 = Class.forName("com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.service.V11_PlanService");
        CGLIB$boarding$0$Method = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods())[0];
        CGLIB$boarding$0$Proxy = MethodProxy.create(cls2, cls, "()V", "boarding", "CGLIB$boarding$0");
    }

    public static MethodProxy CGLIB$findMethodProxy(Signature signature) {
        String obj = signature.toString();
        switch (obj.hashCode()) {
            case -1091433799:
                if (obj.equals("boarding()V")) {
                    return CGLIB$boarding$0$Proxy;
                }
                break;
            case -508378822:
                if (obj.equals("clone()Ljava/lang/Object;")) {
                    return CGLIB$clone$4$Proxy;
                }
                break;
            case 1826985398:
                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
                    return CGLIB$equals$1$Proxy;
                }
                break;
            case 1913648695:
                if (obj.equals("toString()Ljava/lang/String;")) {
                    return CGLIB$toString$2$Proxy;
                }
                break;
            case 1984935277:
                if (obj.equals("hashCode()I")) {
                    return CGLIB$hashCode$3$Proxy;
                }
                break;
        }
        return null;
    }

    final void CGLIB$boarding$0() throws Throwable {
        super.boarding();
    }

    final Object CGLIB$clone$4() throws CloneNotSupportedException {
        return super.clone();
    }

    final boolean CGLIB$equals$1(Object obj) {
        return super.equals(obj);
    }

    final int CGLIB$hashCode$3() {
        return super.hashCode();
    }

    final String CGLIB$toString$2() {
        return super.toString();
    }

    public final void boarding() throws Throwable {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            methodInterceptor.intercept(this, CGLIB$boarding$0$Method, CGLIB$emptyArgs, CGLIB$boarding$0$Proxy);
        } else {
            super.boarding();
        }
    }

    @SneakyThrows
    protected final Object clone() throws CloneNotSupportedException {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        return methodInterceptor != null ? methodInterceptor.intercept(this, CGLIB$clone$4$Method, CGLIB$emptyArgs, CGLIB$clone$4$Proxy) : super.clone();
    }

    @SneakyThrows
    public final boolean equals(Object obj) {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor == null) {
            return super.equals(obj);
        }
        Object intercept = methodInterceptor.intercept(this, CGLIB$equals$1$Method, new Object[]{obj}, CGLIB$equals$1$Proxy);
        return intercept == null ? false : ((Boolean) intercept).booleanValue();
    }

    public Callback getCallback(int i) {
        CGLIB$BIND_CALLBACKS(this);
        switch (i) {
            case 0:
                return this.CGLIB$CALLBACK_0;
            default:
                return null;
        }
    }

    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return new Callback[]{this.CGLIB$CALLBACK_0};
    }



    public Object newInstance(Callback callback) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{callback});
        V11_PlanService$$EnhancerByCGLIB$$37d88b32 v11_PlanService$$EnhancerByCGLIB$$37d88b32 = new V11_PlanService$$EnhancerByCGLIB$$37d88b32();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return v11_PlanService$$EnhancerByCGLIB$$37d88b32;
    }

    public Object newInstance(Class[] clsArr, Object[] objArr, Callback[] callbackArr) {
        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
        switch (clsArr.length) {
            case 0:
                V11_PlanService$$EnhancerByCGLIB$$37d88b32 v11_PlanService$$EnhancerByCGLIB$$37d88b32 = new V11_PlanService$$EnhancerByCGLIB$$37d88b32();
                CGLIB$SET_THREAD_CALLBACKS(null);
                return v11_PlanService$$EnhancerByCGLIB$$37d88b32;
            default:
                throw new IllegalArgumentException("Constructor not found");
        }
    }

    public Object newInstance(Callback[] callbackArr) {
        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
        V11_PlanService$$EnhancerByCGLIB$$37d88b32 v11_PlanService$$EnhancerByCGLIB$$37d88b32 = new V11_PlanService$$EnhancerByCGLIB$$37d88b32();
        CGLIB$SET_THREAD_CALLBACKS(null);
        return v11_PlanService$$EnhancerByCGLIB$$37d88b32;
    }

    public void setCallback(int i, Callback callback) {
        switch (i) {
            case 0:
                this.CGLIB$CALLBACK_0 = (MethodInterceptor) callback;
                return;
            default:
                return;
        }
    }

    public void setCallbacks(Callback[] callbackArr) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor) callbackArr[0];
    }

}