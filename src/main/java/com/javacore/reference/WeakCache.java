package com.javacore.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/9/5 12:32
 * @Version: 1.0
 * @Description:
 */
public class WeakCache {

    public static void main(String[] args) {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        User user = new User("xuliugen", "123456");
        WeakCache.WeakEntry weakEntry = new WeakCache.WeakEntry("654321", user, referenceQueue);
        System.out.println("还没被回收之前的数据：" + weakEntry.get());

        user = null;
        System.gc(); //强制执行GC
        System.runFinalization();

        System.out.println("已经被回收之后的数据：" + weakEntry.get());
        new WeakCache().printReferenceQueue(referenceQueue);
    }

    private void printReferenceQueue(ReferenceQueue<Object> referenceQueue) {
        WeakEntry sv;
        while ((sv = (WeakEntry) referenceQueue.poll()) != null) {
            System.out.println("引用队列中元素的key：" + sv.key + "  value: " + sv.get());
        }
    }

    private static class WeakEntry extends WeakReference<Object> {
        private Object key;

        WeakEntry(Object key, Object value, ReferenceQueue<Object> referenceQueue) {
            //调用父类的构造函数，并传入需要进行关联的引用队列
            super(value, referenceQueue);
            this.key = key;
        }
    }

    public static class User {
        private String userName;
        private String userPwd;

        public User(String userName, String userPwd) {
            this.userName = userName;
            this.userPwd = userPwd;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPwd() {
            return userPwd;
        }

        public void setUserPwd(String userPwd) {
            this.userPwd = userPwd;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", userPwd='" + userPwd + '\'' +
                    '}';
        }

    }


}
