package com.algo.list;

import java.util.HashMap;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 5/22/23 11:59
 * @Version: 1.0
 * @Description:
 */
public class LRUCache {

    class DlinkNode {
        public int key;
        public int value;
        public DlinkNode pre;
        public DlinkNode next;
        DlinkNode(){
        }
        DlinkNode(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    HashMap<Integer,DlinkNode>cache;
    int capacity=0;//HashMap容量
    DlinkNode head;
    DlinkNode tail;

    //构造方法
    public LRUCache(int capacity) {
        this.capacity=capacity;
        //使用指定容量初始化HashMap
        cache=new HashMap<>(capacity);
        //初始化头尾结点
        head=new DlinkNode();
        tail=new DlinkNode();
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        //若当前HashMap中存在该key
        if(cache.containsKey(key)){
            //从HashMap中获取对应的结点
            DlinkNode node=cache.get(key);
            //将该结点移动到链头
            moveToHead(node);
            return node.value;
        }else return -1;
        //当前HashMap中不存在该key，返回-1
    }

    public void put(int key, int value) {
        //若当前HashMap中存在该key
        if(cache.containsKey(key)){
            //从HashMap中获取对应的结点
            DlinkNode node=cache.get(key);
            //更新该结点的值
            node.value=value;
            //将该结点移动到链头
            moveToHead(node);
        }else{ //若当前HashMap中不存在该key
            //首先判断HashMap是否还有多余的容量
            if(cache.size()==capacity){ //容量不足
                //从HashMap中删除链尾结点
                cache.remove(tail.pre.key);
                //从链表中删除链尾结点
                deleteNode(tail.pre);
            }
            //创建一个新的结点
            DlinkNode node=new DlinkNode(key,value);
            //添加到链头
            addNode(node);
            //添加到HashMap中
            cache.put(key,node);
        }
    }

    //删除结点
    void deleteNode(DlinkNode node){
        node.next.pre=node.pre;
        node.pre.next=node.next;
    }

    //在链头添加结点
    void addNode(DlinkNode node){
        node.next=head.next;
        head.next.pre=node;
        head.next=node;
        node.pre=head;
    }

    //将指定结点移动到链头
    void moveToHead(DlinkNode node){
        //删除该结点
        deleteNode(node);
        //在链头添加该结点
        addNode(node);
    }



}
