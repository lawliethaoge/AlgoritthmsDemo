package com.lawliethaoge.tree;

/**
 * 二叉树的节点
 *
 * @author hao@lawliethaoge.top
 * @since 2018/4/26 14:43
 */
public class Node {
    //数据项
    public  long data;
    //左子节点
    public Node leftChild;
    //右子节点
    public Node rightChild;

    /**
     * 构造方法
     * @param data
     */
    public Node(long data) {
        this.data = data;

    }
}
