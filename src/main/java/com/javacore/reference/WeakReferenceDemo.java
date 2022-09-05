package com.javacore.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/9/5 02:57
 * @Version: 1.0
 * @Description:
 */
public class WeakReferenceDemo {

    static ReferenceQueue<Map> referenceQueue = new ReferenceQueue<>();

    public static void main(String[] args) {
        Map s = new HashMap(2);
        s.put("222", "111");

        WeakReference<Map> weakReference = new WeakReference<>(s, referenceQueue);

        System.out.println(weakReference.get());

        s = null;

        System.gc();
        System.runFinalization(); //这句背后执行了什么？

        Reference<? extends Map> poll = referenceQueue.poll();

        System.out.println("after gc : " + poll.get());


    }


}

