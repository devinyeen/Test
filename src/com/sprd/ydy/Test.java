package com.sprd.ydy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Test<E> {

    private static String mQuery = "abc defg hijkl";
    private static String SPACE  = " ";

    public static void main(String[] args) {
        // String[] querySplit = mQuery.split(SPACE);
        // String[][] token = new String[querySplit.length][];
        // for (int i = 0; i < querySplit.length; i++) {
        // token[i] = new String[querySplit[i].length()];
        // for (int j = 0; j < querySplit[i].length(); j++) {
        // token[i][j] = querySplit[i].substring(0, j+1);
        // System.out.println(token[i][j]);
        // }
        // }
        //
        // System.out.println(token.length);
        // for (int i = 0; i < token.length; i++) {
        // for (int j = 0; j < token[i].length; j++) {
        // }
        // }

        // short s1 = 1;
        // s1 =s1 + 1;

        // System.out.println(Byte.SIZE);
        // System.out.println(Short.SIZE);
        // System.out.println(Integer.SIZE);
        // System.out.println(Long.SIZE);
        // System.out.println(Float.SIZE);
        // System.out.println(Double.SIZE);

        // int x=2 ;
        // do{
        // x+=x ;
        // }while(x<17);
        // System.out.println(x);

        // int n =0;
        // switch(n){
        // case 0: System.out.println("first");
        // case 1:
        // case 2: System.out.println("second"); break;
        // default: System.out.println("end");
        // }

        // int x=6,y=8;
        // boolean b;
        // b=x>y || ++x==--y;
        // System.out.println(b);
        // System.out.println(x);
        // System.out.println(y);

        // x=6;y=8;
        // b = false;
        // b=x>y && ++x==--y;
        // System.out.println(b);
        // System.out.println(x);
        // System.out.println(y);

//        String str = "1234";
//        changeStr(str);//TODO
//        System.out.println(str);

//        int[] arr = { 1, 2, 3, 4, 5 }; 
//        changeValue(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        System.out.println(2.00f-1.10f);
//        Other o = new Other();
//        new Test().addOne(o);
//        System.out.println(o.i);

//        Test obj=new Test();
//        obj.method(100);

//        Test o = new Test(); 
//        // Line 11
//
//        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//        hm.put(1, "one");
//        hm.put(2, "two");
//        hm.put(3, "three");
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        System.out.println(hm.entrySet());

//        try {
//            start();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

//        FileOutputStream fos = new FileOutputStream("c:\\demo.txt");
//        fos.write("abc");
//        fos.close();

//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        System.out.println(list1.getClass().equals(list2.getClass()));

//        ArrayList<Number> numbers = new ArrayList<Number>();
//        numbers.add(new Integer(10));
//        numbers.add(new Double(10.0d));
//        System.out.println(numbers);

//        Fruit f = new Apple();
//        f.setDate(new Date());

//        Apple apple = new Apple();
//        apple.print(100);
//        System.out.println(apple.name);
//
//        Fruit fruit = apple;
//        fruit.print(100);
//        System.out.println(fruit.name);

        Object[] os = {"a", "b"};
        for(Object o : os) {
            
        }
    }

//    public static <T> T compare(T t1,T t2){
//        if(t1.compareTo(t2) >= 0){
//            return t1;
//        } else{
//            return t2;
//        }
//    }

//    private E animal; 
//    Test(){
//        animal = new E();
//    }

//    public static void start() throws IOException, RuntimeException{ 
//        throw new RuntimeException("Not able to Start");
//    }
//    public static void cat(File file) {
//        RandomAccessFile input = null;
//        String line = null;
//
//        try {
//            input = new RandomAccessFile(file, "r");
//            while ((line = input.readLine()) != null) {
//                System.out.println(line);
//            }
//            return;
//        } finally {
//            if (input != null) {
//                input.close();
//            }
//        }
//    }

//    public void someOuterMethod() {
//        // Line 3
//        new InnerClass();
//    }
//
//    public class InnerClass{
//    }

//    void method(int i){
//        System.out.println("int: "+i);
//    }
//    void method(long i){
//        System.out.println("long: "+i);
//    }

//    public static void changeStr(String str) {
//        str = "welcome";
//    }

//    private static void changeValue(int[] arr) {
//        for (int i = 0; i < arr.length; i++)
//            arr[i] *= 2;
//    }
//    public void addOne(final Other o) {
//        o.i++;
//    }

}

//class Other {
//    public int i;
//}

//class Fruit {
//    public void setDate(Object d) {
//        System.out.println("Fruit.setDate(Object d)");
//    }
//}
//class Apple extends Fruit {
//    public void setDate(Date d) {
//        System.out.println("Apple.setDate(Date d)");
//    }
//}
class Fruit{
    String name = "Fruit";
    public void print(int i){ 
        System.out.println("Fruit"+i); 
    }
}

class Apple extends Fruit{ 
    String name = "Apple";
    public void print(int i){
        System.out.println("Apple"+i);
    } 
}
