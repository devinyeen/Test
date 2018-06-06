package com.spread.ydy.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortSelection {

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
        selectionSort(al);
        System.out.println(al);
    }

    public static List<Integer> selectionSort(List<Integer> a) {
        if (a == null && a.size() == 0)
            return a;
        int temp = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                } else {
                    continue;
                }
            }
        }
        return a;
    }
}
