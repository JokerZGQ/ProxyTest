package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhaoguoqing on 2018-09-13.
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                15,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(100),//当队列满了并且最大线程数满了,在控制台可以看到拒绝策略的结果(默认抛异常)
                //new LinkedBlockingDeque<Runnable>(),//由于LinkedBlockingDeque可以无限添加,所以线程数最多等于10(corePoolSize)
                new MyThreadFactory() );
        System.out.println("线程池创建完成!");
        threadPoolExecutor.execute(new MyTask("任务--"));
        System.out.println(threadPoolExecutor.getCorePoolSize());
        /*for(int i=0;i<100;i++){
            final int finalI = i;
            new Thread(() -> {
                threadPoolExecutor.execute(new MyTask("任务--"+ finalI));
            }).start();
        }*/
       /* for(int i=0;i<10;i++){
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    threadPoolExecutor.execute(new MyTask("任务--"+ finalI));
                }
            }).start();
        }*/
    }
}
