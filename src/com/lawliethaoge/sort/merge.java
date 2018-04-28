package com.lawliethaoge.sort;

/**
 * 归并排序(将两个有序数组排序)
 *
 * @author hao@lawliet.com
 * @since 2018/4/21 18:00
 */
public class merge {
    //将两个有序数组归并排序
    public static void sort(int a[], int b[], int[] c) {    //一般的写法
        int i, j, k;
        i = j = k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

    }

    public static void resort(int[] a, int lo, int mid, int hi) {  //将一个数组中两个 部分有序 进行归并
        int[] aux = new int[hi + 1];
        int i = lo, j = mid + 1;
        for (int k = lo; k < hi; k++) { //将a[]复制到aux[]中
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[i] < aux[j]) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 9};
        int[] b = {3, 5, 6, 7, 8, 9, 10, 11};
        int[] d = {4, 2, 1, 4, 6, 8, 9, 3, 5, 6, 7, 8, 9, 10, 11};
        int[] c = new int[a.length + b.length];
        sort(a, b, c);
        for (int num : c) {
            System.out.print(num + ",");
        }
        System.out.println();


        resort(d, 2, 6, 14);
        for (int num : d) {
            System.out.print(num + ",");
        }
    }
}
