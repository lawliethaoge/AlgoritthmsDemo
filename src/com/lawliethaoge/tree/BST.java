package com.lawliethaoge.tree;

import java.util.Currency;

/**
 * @author hao@lawliet.com
 * @since 2018/4/26 14:50
 */
public class BST {
    //根节点
    public Node root;

    /**
     * 插入节点
     */
    public void insert(long data) {
        //封装新节点
        Node newNode = new Node(data);
        Node nowNode = null;
        if (root == null) {
            root = newNode;
            return;
        } else {
            nowNode = root;
            while (nowNode != null) {
                if (newNode.data < nowNode.data) {   //小于时插入左子树
                    if (nowNode.leftChild == null) {
                        nowNode.leftChild = newNode;
                        return;
                    } else {
                        nowNode = nowNode.leftChild;

                    }
                } else {    //大于时插入右子树
                    if (nowNode.rightChild == null) {
                        nowNode.rightChild = newNode;
                        return;

                    } else {
                        nowNode = nowNode.rightChild;
                    }
                }
            }
        }


    }

    /**
     * 查找节点
     */
    public void find() {

    }

    /**
     * 删除节点
     */
    public void deleted() {

    }

    /**
     * 前序遍历
     *
     * @param localNode
     */
    public static void frontOrder(Node localNode) {
        if (localNode != null) {
            System.out.println(localNode.data);
            //前序遍历左子树
            frontOrder(localNode.leftChild);
            //前序遍历右子树
            frontOrder(localNode.rightChild);
        }

    }

    /**
     * 中序排序
     * @param localNode
     */
    public  static  void inOrder(Node localNode){
        if(localNode != null){
            //中序遍历左子树
            inOrder(localNode.leftChild);
            //访问根节点
            System.out.println(localNode.data);
            //中序遍历右子树
            inOrder(localNode.rightChild);
        }

    }

    /**
     * 后序遍历
     * @param localNode
     */
    public  static  void afterOrder(Node localNode){
        if(localNode != null){
            //中序遍历左子树
            afterOrder(localNode.leftChild);
            //中序遍历右子树
            afterOrder(localNode.rightChild);
            //访问根节点
            System.out.println(localNode.data);

        }

    }


    public static void main(String[] args) {
        BST treeB = new BST();
        treeB.insert(10);
        treeB.insert(20);
        treeB.insert(15);
        treeB.insert(3);
        treeB.insert(4);
        treeB.insert(90);
//        System.out.println(treeB.root.data);
//        System.out.println(treeB.root.leftChild.data);
//        System.out.println(treeB.root.rightChild.data);
//        System.out.println(treeB.root.rightChild.rightChild.data);
//        System.out.println(treeB.root.rightChild.rightChild.rightChild.data);
        afterOrder(treeB.root);
    }
}
