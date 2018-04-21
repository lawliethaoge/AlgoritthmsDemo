package com.lawliethaoge.sort;


import java.util.Scanner;

/**
 * 插入排序
 * @author hao@lawliet.com
 * @since 2018/4/20 20:15
 */
public class Insertion {
    public  static void sort(long[] a){
       long tmp = 0;
       for(int i=1;i<a.length;i++){
           for(int j=i;j>0 && a[j]<a[j-1];j--){  //将数组右移
               tmp=a[i];
               a[j] = a[j-1];
               a[j-1] =tmp;
           }

       }
    }

    public static void main(String[] args) {
        long[] a = {1, 5, 2, 67, 31, 53, 674};
        sort(a);

        for(long b: a){
            System.out.print(b+",");
        }


    }


}
