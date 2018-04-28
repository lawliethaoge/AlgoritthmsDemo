package com.lawliethaoge.sort;

/**
 * 快速排序
 * @author hao@lawliet.com
 * @since 2018/4/22 16:46
 */
public class Quick {
    /**
     *  得出分界点
     * @author hao
     * @param [a, left, right]
     * @return int
     */
    public static int partition(long[] a, int left, int right,long point) {
        int leftPtr = left-1;
        int rightPtr = right;
        while (true) {
            while (leftPtr < rightPtr && a[++leftPtr] < point) ;    //将比关键子小的留在左端
            while (leftPtr < rightPtr && a[--rightPtr] > point) ;   //将比关键字打的留在右端
            if (leftPtr >= rightPtr) {
                break;
            } else {
                long tmp = a[leftPtr];
                a[leftPtr] = a[rightPtr];
                a[rightPtr] = tmp;
            }
        }
        //将关键字与当前leftPtr所指的交换
        long tmp1 = a[leftPtr];
        a[leftPtr] = a[right];
        a[right] = tmp1;
        //返回坐标
        return leftPtr;

    }

    /**
     * 快速排序最终实现
     * @author hao
     * @param [a, left, right]
     * @return void
     */
    public static  void sort(long a[] ,int left ,int right){
        //判断是否递归
        if(right<=left){
            return;
        }else {
            //设置关键词
            long point = a[right];
            //获得切入点，同时对数组进行划分
            int partition = partition(a, left, right,point);
            //递归
            //对左边的子数组进行快速排序
            sort(a, left, partition - 1);
            //对右边的自数字进行快速排序
            sort(a, partition + 1, right);
        }

    }





    public static void main(String[] args) {
        long[] a = new long[10];
        for(int i=0;i<a.length;i++){
            a[i] = (long) (Math.random()*99);
        }
        for(long b :a){
            System.out.print(b+",");
        }
        System.out.println();

        sort(a,0,a.length-1);
        for(long b :a){
            System.out.print(b+",");
        }

    }
}
