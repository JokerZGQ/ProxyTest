package com.company;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhaoguoqing on 2018-09-13.
 */
public class MyThreadFactory  implements ThreadFactory {

    AtomicInteger atomicInteger = new AtomicInteger(0);
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("imrookie-" + atomicInteger.incrementAndGet());//设置自己的线程名
        thread.setPriority(1);//根据实际需要设置线程优先级
        System.out.println("MyThreadFactory 创建一个线程...");
        return thread;
    }
}
