package com.spread.ydy.algorithms.ch01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    private static final int SIZE = 4096;
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
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
        System.out.println(strArray);
        numberArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numberArray[i] = Integer.valueOf(strArray[i]);
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
        int index = rank(Integer.valueOf(read), numberArray);
        if (index == -1) {
            System.out.println(read);
        } else {
            System.out.println(index);
        }
//        int[] whitelist = In.readInts(args[0]);
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) == -1)
//                System.out.println(key);
//        }
    }
}
