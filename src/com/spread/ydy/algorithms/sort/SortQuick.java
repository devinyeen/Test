package com.spread.ydy.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class SortQuick {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(6);
        al.add(2);
        al.add(0);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(9);
        int[] a = {6, 2, 0, 1, 4, 5, 8, 9};
        quickSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    private static void quickSort(int[] arrays) {
        subQuickSort(arrays, 0, arrays.length - 1);
    }

    private static void subQuickSort(int[] arrays, int start, int end) {
        if (start >= end) {
            return;
        }
        int middleIndex = subQuickSortCore(arrays, start, end);
        subQuickSort(arrays, start, middleIndex - 1);
        subQuickSort(arrays, middleIndex + 1, end);
    }

    private static int subQuickSortCore(int[] arrays, int start, int end) {
        int middleValue = arrays[start];
        while (start < end) {
            while (middleValue <= arrays[end]  && start < end) {
                end--;
            }
            arrays[start] = arrays[end];
            while (arrays[start] <= middleValue && start < end) {
                start++;
            }
            arrays[end] = arrays[start];
        }
        arrays[start] = middleValue;
        return start;
    }
}
