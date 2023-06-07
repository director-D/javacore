package com.algo.binarytree;

import java.util.LinkedList;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 5/24/23 01:02
 * @Version: 1.0
 * @Description:
 */
public class BinTreeVisit {

    class TreeNode<T>{
        T value;
        TreeNode left;
        TreeNode right;
    }



    public static <T> void postorderTraversal(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        LinkedList<TreeNode<T>> linkedList = new LinkedList<>();
        TreeNode<T> node = root, prevNode = null;

        while (node != null || !linkedList.isEmpty()) {
            if (node != null) {
                linkedList.addFirst(node); // 将节点添加到链表的头部
                node = node.right; // 遍历右子树
            } else {
                node = linkedList.getFirst();
                if (node.left != null && node.left != prevNode) { // 如果左子树还未遍历
                    node = node.left; // 遍历左子树
                } else { // 左子树已经遍历完毕
                    linkedList.removeFirst(); // 移除当前节点
                    System.out.print(node.value + " "); // 输出节点值
                    prevNode = node; // 记录已经遍历过的节点
                    node = null; // 重置当前节点
                }
            }
        }
    }

    public static void main(String[] args) {

    }



}
