package com.javacore.bitmap;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/12/11 12:07
 * @Version: 1.0
 * @Description:
 */
public class BitMoveTest {

    public static void main(String[] args) {
        int i = (1 + (1 << 16) - 1) >>> 16;
        System.out.println(i);
    }
}
