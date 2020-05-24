package com.wenhao.designpatterns.v11reviewproxy.dynamicproxy.cglib.service;

import net.sf.cglib.core.Signature;
import net.sf.cglib.reflect.FastClass;

import java.lang.reflect.InvocationTargetException;

/* compiled from: <generated> */
public class V11_PlanService$$FastClassByCGLIB$$924d9c6a extends FastClass {
    public V11_PlanService$$FastClassByCGLIB$$924d9c6a(Class cls) {
        super(cls);
    }

    public int getIndex(String str, Class[] clsArr) {
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    switch (clsArr.length) {
                        case 0:
                            return 2;
                        default:
                            break;
                    }
                }
                break;
            case -1295482945:
                if (str.equals("equals")) {
                    switch (clsArr.length) {
                        case 1:
                            if (clsArr[0].getName().equals("java.lang.Object")) {
                                return 1;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 147696667:
                if (str.equals("hashCode")) {
                    switch (clsArr.length) {
                        case 0:
                            return 3;
                        default:
                            break;
                    }
                }
                break;
            case 1610774332:
                if (str.equals("boarding")) {
                    switch (clsArr.length) {
                        case 0:
                            return 0;
                        default:
                            break;
                    }
                }
                break;
        }
        return -1;
    }

    public int getIndex(Signature signature) {
        String obj = signature.toString();
        switch (obj.hashCode()) {
            case -1091433799:
                if (obj.equals("boarding()V")) {
                    return 0;
                }
                break;
            case 1826985398:
                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
                    return 1;
                }
                break;
            case 1913648695:
                if (obj.equals("toString()Ljava/lang/String;")) {
                    return 2;
                }
                break;
            case 1984935277:
                if (obj.equals("hashCode()I")) {
                    return 3;
                }
                break;
        }
        return -1;
    }

    public int getIndex(Class[] clsArr) {
        switch (clsArr.length) {
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    public int getMaxIndex() {
        return 3;
    }

    public Object invoke(int i, Object obj, Object[] objArr) throws InvocationTargetException {
        InvocationTargetException invocationTargetException;
        V11_PlanService v11_PlanService = (V11_PlanService) obj;
        switch (i) {
            case 0:
                try {
                    v11_PlanService.boarding();
                    return null;
                } catch (Throwable th) {
                    invocationTargetException = new InvocationTargetException(th);
                }
            case 1:
                return new Boolean(v11_PlanService.equals(objArr[0]));
            case 2:
                return v11_PlanService.toString();
            case 3:
                return new Integer(v11_PlanService.hashCode());
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
        //invocationTargetException = new InvocationTargetException(th);
    }

    public Object newInstance(int i, Object[] objArr) throws InvocationTargetException {
        switch (i) {
            case 0:
                try {
                    return new V11_PlanService();
                } catch (Throwable th) {
                    InvocationTargetException invocationTargetException = new InvocationTargetException(th);
                }
            default:
                throw new IllegalArgumentException("Cannot find matching method/constructor");
        }
    }
}