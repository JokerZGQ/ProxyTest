package com.company;

/**
 * Created by zhaoguoqing on 2018-09-13.
 */
public class MyTask  implements Runnable {
    private String text;
    public MyTask(String text){
        this.text = text;
    }
    public void run() {
        System.out.println("该任务的执行线程为: "+Thread.currentThread()+" , 任务执行: " + text);
    }

}

