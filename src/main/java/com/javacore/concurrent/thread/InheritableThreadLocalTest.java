package com.javacore.concurrent.thread;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/12/1 09:02
 * @Version: 1.0
 * @Description:
 */
public class InheritableThreadLocalTest {

    private static ThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();


    public static void main(String[] args) throws InterruptedException {
        inheritableThreadLocal.set("inheritableThreadLocal");
        threadLocal.set("threadLocal");

        Thread childThread = new Thread(()->{
            System.out.println("child thread inheritableThreadLocal.get() : " + inheritableThreadLocal.get());
            System.out.println("child thread threadLocal.get() : " + threadLocal.get());
        });

        childThread.start();

        childThread.join();

        System.out.println("main thread inheritableThreadLocal.get() : " + inheritableThreadLocal.get());
        System.out.println("main thread threadLocal.get() :  " + threadLocal.get());

    }


}
