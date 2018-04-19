package com.lawliethaoge.stack;

/**
 * 下压堆栈（链表实现）
 * @author hao@lawliet.com
 * @since 2018/4/19 16:39
 */
public class LinkedListStack<Item>{
    private Node first;
    private  int N;
    public boolean isEmpty(){ return first==null;}
    public int size(){return N;}
    public void push(Item item){    //向栈顶增加元素
        Node oldfirist = first;
        first =new Node();
        first.item = item;
        first.next = oldfirist;
        N++;
    }

    public Item pop(){  //从栈顶删除元素
        Item item = (Item)first.item;
        first = first.next;
        N--;
        return item;
    }



}
