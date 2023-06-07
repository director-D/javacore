package com.javacore.collection;

import java.util.Arrays;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 5/19/23 10:29
 * @Version: 1.0
 * @Description:
 */
public class A {

    private static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj.toString());
        }
    }
    private static class User {
        String name;
        public User(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "name: " + name;
        }
    }

    public static void main(String[] args) {
        int[] intvalues = new int[]{1000, 2000, 3000, 4000, 5000, 6000};
        int[] intcopy = new int[intvalues.length];
        System.arraycopy(intvalues, 0, intcopy, 0, intvalues.length);
        intvalues[0] = 400;
        System.out.println("intcopy:" + Arrays.toString(intcopy));

        Integer[] values = new Integer[]{1000, 2000, 3000, 4000};
        Integer[] copy = new Integer[values.length];
        System.arraycopy(values, 0, copy, 0, values.length);

        for (int i = 0; i < values.length; i++) {
            System.out.printf("values == copy : %s\n", values[i] == copy[i]);
        }

        values[0] = new Integer(990);

        System.out.println("values:" + Arrays.toString(values));
        System.out.println("copy:" + Arrays.toString(copy));

        User[] array = { new User("aa"), new User("bb") };
        User[] targetArr = new User[array.length];
        System.arraycopy(array, 0, targetArr, 0, targetArr.length);
        printArray(targetArr);
        array[0].name = "dd";
        printArray(targetArr);
        array[0] = new User("mm");
        printArray(targetArr);
    }
}
