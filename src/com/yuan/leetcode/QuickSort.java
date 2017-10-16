package com.yuan.leetcode;

/**
 * 快速排序
 * <p>
 * 原理：
 * http://www.cnblogs.com/yanlingyin/archive/2012/04/16/2441979.html
 */
public class QuickSort {

    public static void quickSort(int[] sourceArr, int p, int r) {
        if (p < 0 || p >= r) return;
        //find partition
        int i = p - 1;
        int x = sourceArr[r];
        int tmp;
        for (int j = p; j < r; j++) {
            if (sourceArr[j] < x) {
                i++;
                tmp = sourceArr[i];
                sourceArr[i] = sourceArr[j];
                sourceArr[j] = tmp;
            }
        }
        i++;
        sourceArr[r] = sourceArr[i];
        sourceArr[i] = x;
        quickSort(sourceArr, p, i - 1);
        quickSort(sourceArr, i + 1, r);
    }
}
