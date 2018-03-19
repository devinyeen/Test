package com.spread.ydy.algorithms.ch01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearchSelf {
    private static final int SIZE = 4096;
//    public static int rank(int key, int[] a) {
//        int lo = 0;
//        int hi = a.length - 1;
//        while (lo <= hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (key < a[mid])
//                hi = mid - 1;
//            else if (key > a[mid])
//                lo = mid + 1;
//            else
//                return mid;
//        }
//        return -1;
//    }

    public static void main(String[] args) {

//        In in  = new In();
//        int[] whitelist = in.readAllInts();//readInts(args[0]);
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) == -1)
//                StdOut.println(key);
//        }
        File numFile = new File("D:\\workspace\\github\\Test\\src\\com\\spread\\ydy\\algorithms\\ch01\\numberList.txt");

        FileInputStream fis = null;
        String strList = "";
        int[] numberArray;
        try {
            fis = new FileInputStream(numFile);

            int len = 0;
            byte[] buf = new byte[SIZE];
            while ((len = fis.read(buf)) != -1) {
                strList += new String(buf, 0, len);
                //System.out.println(new String(buf, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String[] strArray = strList.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();

        numberArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numberArray[i] = Integer.valueOf(strArray[i]);
        }

        reverseArray(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        Arrays.sort(numberArray);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        String read = null;
        System.out.print("输入数据：");
        try {
         read = br.readLine();
        } catch (IOException e) {
         e.printStackTrace();
        }

        int index = binarySearch(Integer.valueOf(read), numberArray);
//        int index = rank(Integer.valueOf(read), numberArray, 0, numberArray.length - 1);
        if (index == -1) {
            System.out.println(read);
        } else {
            System.out.println(index);
        }
    }

    public static int binarySearch(int key, int[] a) {
        int len = a.length;
        int indexStart = 0;
        int indexMid = len/2;
        int indexLast = len - 1;
        while (indexStart <= indexLast) {
            System.out.println("indexstart = " + indexStart);
            System.out.println("indexMid = " + indexMid);
            System.out.println("indexLast = " + indexLast);
            System.out.println("==============");
            if (key == a[indexMid]) {
                return indexMid;
            } else if (key < a[indexMid]) {
                indexLast = indexMid - 1;
            } else if (key > a[indexMid]) {
                indexStart = indexMid + 1;
            }
            indexMid = (indexStart + indexLast)/2;
        }
        return -1;
    }

    // 递归二分查找
    public static int binarySearch(int key, int[] a, int lo, int hi) {
        int mid = (lo + hi)/2;
        if (lo > hi) return -1;
        if (key < a[mid]) {
            return binarySearch(key, a, lo, mid-1);
        } else if (key > a[mid]) {
            return binarySearch(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void reverseArray(int[] a) {
        int len = a.length;
        for(int i = 0; i < len/2;i++) {
            int temp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = temp;
        }
    }
}
