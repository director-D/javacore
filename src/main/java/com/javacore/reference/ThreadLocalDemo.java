package com.javacore.reference;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/9/5 12:08
 * @Version: 1.0
 * @Description:
 */
public class ThreadLocalDemo {
    private static final int THREAD_LOOP_SIZE = 20;

    public static void main(String[] args) throws InterruptedException {

        try {
            //等待连接JConsole
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < THREAD_LOOP_SIZE; i++) {
            ThreadLocal<Map<Integer, String>> threadLocal = new ThreadLocal<>();
            Map<Integer, String> map = new HashMap<>();
            map.put(i, "我是第" + i + "个ThreadLocal数据！");
            threadLocal.set(map);
            threadLocal.get();

            System.out.println("第" + i + "次获取ThreadLocal中的数据");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
