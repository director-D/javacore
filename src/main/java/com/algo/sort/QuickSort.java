package com.algo.sort;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/11/18 10:52
 * @Version: 1.0
 * @Description: 参考 https://blog.csdn.net/C_Trip/article/details/126624319?spm=1001.2101.3001.6650.2&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EYuanLiJiHua%7EPosition-2-126624319-blog-6684558.pc_relevant_landingrelevant&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EYuanLiJiHua%7EPosition-2-126624319-blog-6684558.pc_relevant_landingrelevant&utm_relevant_index=5
 */
public class QuickSort {

    /**
     * hoare法（左右指针法）
     * @param a
     * @param start
     * @param end
     * @return
     */
    public static int coreSort(int a[],int start,int end){
        int left = start , right = end ,key = start;
        while (left < right){
            while (left<right && a[right]>=a[key]){
                right--;
            }
            while (left<right && a[left]<=a[key]){
                left++;
            }

            //swap a[left] a[right]
            swap(left,right,a);
        }
        //swap a[key] a[left]
        int tempIndex = left;
        swap(key,tempIndex,a);
        return tempIndex;
    }

    /**
     * 挖坑法
     * @param a
     * @param begin
     * @param end
     * @return
     */
    int DigHoleSort(int a[], int begin, int end)
    {
        int key = a[begin];
        int left = begin, right = end;
        while (left < right)
        {
            //右边找小值
            while (left < right && a[right] >= key)
                right--;
            //放到左边坑位中，右边形成新的坑
            a[left] = a[right];

            //左边找大值
            while (left < right && a[left] <= key)
                left++;
            //放到右边坑位中，左边形成新的坑
            a[right] = a[left];
        }
        int meet = left;
        a[meet] = key;
        return left;
    }
    void QuickSort(int a[], int begin, int end)
    {
        if (begin >= end)
            return;
        //int meet = HoareSort(a, begin, end);
        int meet = DigHoleSort(a, begin, end);
        QuickSort(a, begin, meet - 1);
        QuickSort(a, meet + 1, end);
    }


    //前后指针法
    int PBIndexSort(int a[], int begin, int end)
    {
        int key = begin;
        //定义两个指针，一前一后
        int prev = begin, cur = begin + 1;
        while (cur <= end)
        {
            //如果cur位置值比key小则与perv前一个值进行交换
            if (a[cur] < a[key] && ++prev != cur)
            {
                swap( cur, prev , a );
            }
            cur++;
        }
        //将key放在prev位置
        swap(prev, begin , a);
        return prev;
    }
    void QuickSort3(int a[], int begain, int end)
    {
        if (begain >= end)
            return;
        //int meet = HoareSort(a, begain, end);
        //int meet = DigHoleSort(a, begain, end);
        int meet = PBIndexSort(a, begain, end);
        QuickSort3(a, begain, meet - 1);
        QuickSort3(a, meet + 1, end);
    }


    public static void swap(int sourceIndex,int targetIndex,int a[]){
        if(sourceIndex >= targetIndex){
            return;
        }
        int temp = a[sourceIndex];
        a[sourceIndex] = a[targetIndex];
        a[targetIndex] = temp;
    }

    public static void quickSort(int a[],int start,int end){
        if(start>=end){
            return;
        }
        int partitionIndex = coreSort(a, start, end);
        //partition 处的元素已经有序不需要再排了，所以左右排除partition后的片段排序
        quickSort(a,start,partitionIndex-1);
        quickSort(a,partitionIndex+1,end);
    }

    //三数取中法
    int GetMidIndex(int a[], int left, int right)
    {
        int mid = (left + right) >> 1;
        if (a[mid] > a[left])
        {
            if (a[mid] < a[right])
                return mid;
            else if (a[left] < a[right])
                return right;
            else
                return left;
        }
        else
        {
            if (a[mid] > a[right])
                return mid;
            else if (a[left] < a[right])
                return left;
            else
                return right;
        }
    }
    //hoare法（左右指针法）
    int HoareSort(int a[], int begain, int end)
    {
        int mid = GetMidIndex(a, begain, end);
        swap(mid, begain,a);

        //这里我们仍然取key为最左边的数，只不过最左边的值变了
        int key = begain;
        int left = begain, right = end;
        while (left < right)
        {
            //右边找比key小的值
            while (left < right && a[right] >= a[key])
                right--;
            //左边找比key大的值
            while (left < right && a[left] <= a[key])
                left++;
            swap(right, left,a);
        }
        int meet = left;
        swap(meet, key ,a);
        return meet;
    }


    //非递归实现
    void QuickSortNonR(int a[], int begin,  int end)
    {
        Stack st = new Stack();

        //入栈
        st.push(begin);
        st.push(end);
        while (!st.isEmpty())
        {
            //出栈
            int right = (int) st.pop();
            int left = (int) st.pop();

            //单趟排序
            int mid = HoareSort(a, left, right);

            if (left < mid - 1)
            {
                st.push(left);
                st.push(mid-1);
            }
            if (mid + 1 < right)
            {
                st.push(mid+1);
                st.push(right);
            }
        }
    }




    /**
     * 校验数组是否已经有序了
     * @param a
     * @return
     */
    public static boolean checkIsSortArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            if(i!=a.length-1 && a[i+1]<a[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = IntStream.generate(()-> (int) (Math.random()*10000)).limit(100).toArray();
        Arrays.stream(a).forEach(i->{
            System.out.print(i+" , ");
        });
        System.out.println("+++++++++++++++++");
        System.out.println(checkIsSortArray(a));
        System.out.println("+++++++++++++++++");
        quickSort(a,0,a.length-1);
        Arrays.stream(a).forEach(i->{
            System.out.print(i+" , ");
        });
        System.out.println("+++++++++++++++++");
        System.out.println(checkIsSortArray(a));
    }



}
