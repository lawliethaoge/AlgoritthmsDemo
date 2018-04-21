package com.lawliethaoge.sort;

/**
 * 希尔排序
 *
 * @author hao@lawliet.com
 * @since 2018/4/21 16:59
 */
public class Shell {
    public static void sort(long[] a) {
        long tmp = 0;
        long N = a.length;
        int h = 1;
        while (h < N / 3) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j > 0 && a[j] < a[j - h]; j -= h) { //以间隔h进行插入
                    tmp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = tmp;
                }
            }
            h = h / 3;
        }

    }

    public static void main(String[] args) {
        long[] a = {1, 5, 2, 67, 31, 53, 674};
        sort(a);
        for (long b : a) {
            System.out.print(b + ",");
        }
    }
}
