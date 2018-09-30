package com.company;

public class Main {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorldImpl();
        ProxyHello proxyInovationHandler = new ProxyHello(hello);
        HelloWorld proxy = (HelloWorld) proxyInovationHandler.getProxy();
        proxy.say();
        int j=0;
        for(int i=0;i<100;i++)
            j = ++j;
        System.out.println(j);
    }
}
