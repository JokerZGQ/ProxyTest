package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhaoguoqing on 2018-08-13.
 */
public class ProxyHello implements InvocationHandler {
    //要代理的对象
    private Object target;

    public ProxyHello(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread()
                        .getContextClassLoader(), target.getClass().getInterfaces(),
                this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----- before -----");
        Object rtn = method.invoke(target, args);
        System.out.println("----- after -----");
        return rtn;
    }
}
