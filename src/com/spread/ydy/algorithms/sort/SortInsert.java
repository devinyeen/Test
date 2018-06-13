package com.spread.ydy.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class SortInsert {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] a = {6, 2, 0, 1, 4, 5, 8, 9};
        al.add(6);
        al.add(2);
        al.add(0);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(9);
        insertSort(al);
        System.out.println(al);
        al.add(5, 10);
        System.out.println(al);
    }

    public static void insertSort(List<Integer> a) {
        int N = a.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                if (a.get(i) > a.get(j)) {
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }
}
