package com.spread.ydy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test<E> {

//    private static String mQuery = "abc defg hijkl";
//    private static String SPACE  = " ";

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

        // String str = "1234";
        // changeStr(str);//TODO
        // System.out.println(str);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // changeValue(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // System.out.println(2.00f-1.10f);
        // Other o = new Other();
        // new Test().addOne(o);
        // System.out.println(o.i);

        // Test obj=new Test();
        // obj.method(100);

        // Test o = new Test();
        // // Line 11
        //
        // HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // hm.put(1, "one");
        // hm.put(2, "two");
        // hm.put(3, "three");
        // System.out.println(hm.keySet());
        // System.out.println(hm.values());
        // System.out.println(hm.entrySet());

        // try {
        // start();
        // } catch (Exception ex) {
        // ex.printStackTrace();
        // }

        // FileOutputStream fos = new FileOutputStream("c:\\demo.txt");
        // fos.write("abc");
        // fos.close();

        // ArrayList<String> list1 = new ArrayList<String>();
        // ArrayList<Integer> list2 = new ArrayList<Integer>();
        // System.out.println(list1.getClass().equals(list2.getClass()));

        // ArrayList<Number> numbers = new ArrayList<Number>();
        // numbers.add(new Integer(10));
        // numbers.add(new Double(10.0d));
        // System.out.println(numbers);

        // Fruit f = new Apple();
        // f.setDate(new Date());

        // Apple apple = new Apple();
        // apple.print(100);
        // System.out.println(apple.name);
        //
        // Fruit fruit = apple;
        // fruit.print(100);
        // System.out.println(fruit.name);

        // ArrayList<String> al = new ArrayList<String>();
        // al.add("fsfsfs");
        // al.add("fsfsfsfsf");
        // System.out.println(al.get(0).hashCode());
        // System.out.println(al.get(1).hashCode());
        // ArrayList<String> alClone = (ArrayList<String>)al.clone();
        // al.clear();
        // System.out.println(al);
        // System.out.println(alClone.get(0).hashCode());
        // System.out.println(alClone.get(1).hashCode());
        // System.out.println(alClone);

        // int i =0,len=7;
        // System.out.println((i+len)/2);

        // System.out.println(1.0/0.0);//Infinity

        // System.out.println((0+15)/2);
        // System.out.println(2.0e-6*100000000.1);
        // System.out.println(true && false || true && true);
        // System.out.println(1+2+"3");

        BinaryTree bt = new BinaryTree();
        int[] a = { 6, 2, 0, 1, 4, 5, 8, 9 };
        for (int i = 0; i < a.length; i++) {
            bt.buildTree(bt.getRoot(), a[i]);
        }
        BinaryTree.preOrderCru(bt.getRoot());
        System.out.println();
        System.out.println(BinaryTree.preOrderNormal(bt.getRoot()));
        System.out.println();
        BinaryTree.inOrderCru(bt.getRoot());
        System.out.println();
        BinaryTree.postOrderCru(bt.getRoot());
    }

    // public static <T> T compare(T t1,T t2){
    // if(t1.compareTo(t2) >= 0){
    // return t1;
    // } else{
    // return t2;
    // }
    // }

    // private E animal;
    // Test(){
    // animal = new E();
    // }

    // public static void start() throws IOException, RuntimeException{
    // throw new RuntimeException("Not able to Start");
    // }
    // public static void cat(File file) {
    // RandomAccessFile input = null;
    // String line = null;
    //
    // try {
    // input = new RandomAccessFile(file, "r");
    // while ((line = input.readLine()) != null) {
    // System.out.println(line);
    // }
    // return;
    // } finally {
    // if (input != null) {
    // input.close();
    // }
    // }
    // }

    // public void someOuterMethod() {
    // // Line 3
    // new InnerClass();
    // }
    //
    // public class InnerClass{
    // }

    // void method(int i){
    // System.out.println("int: "+i);
    // }
    // void method(long i){
    // System.out.println("long: "+i);
    // }

    // public static void changeStr(String str) {
    // str = "welcome";
    // }

    // private static void changeValue(int[] arr) {
    // for (int i = 0; i < arr.length; i++)
    // arr[i] *= 2;
    // }
    // public void addOne(final Other o) {
    // o.i++;
    // }

}

class BinaryTree {
    public BinaryTree() {
        root = null;
    }

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void buildTree(TreeNode tn, int data) {
        TreeNode tnT = new TreeNode(data);
        if (null == root) {
            root = tnT;
        } else {
            if (data < tn.getValue()) {
                if (null == tn.getLeft()) {
                    tn.left = tnT;
                } else {
                    buildTree(tn.getLeft(), data);
                }
            } else {
                if (null == tn.getRight()) {
                    tn.right = tnT;
                } else {
                    buildTree(tn.getRight(), data);
                }
            }
        }
    }

    public class TreeNode {

        private int value;

        public int getValue() {
            return value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

    }

    public static void visit(TreeNode tn) {
        System.out.print(tn.getValue() + " ");
    }

    public static void preOrderCru(TreeNode tn) {
        if (tn == null)
            return;
        visit(tn);
        preOrderCru(tn.getLeft());
        preOrderCru(tn.getRight());
    }

    public static List<Integer> preOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(tn);
        while(!stack.isEmpty()) {
            TreeNode tnT = stack.pop();
            if (null != tnT) {
                results.add(tnT.getValue());
                stack.push(tnT.getRight());
                stack.push(tnT.getLeft());
            }
        }

        return results;
    }

    public static void inOrderCru(TreeNode tn) {
        if (null == tn)
            return;
        inOrderCru(tn.getLeft());
        visit(tn);
        inOrderCru(tn.getRight());
    }

    public static List<Integer> inOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (null == tn)
            return results;
        stack.push(tn);
        while(tn.getLeft() != null) {
            tn = tn.getLeft();
            stack.push(tn);
        }
        return results;
    }

    public static void postOrderCru(TreeNode tn) {
        if (null == tn)
            return;
        postOrderCru(tn.getLeft());
        postOrderCru(tn.getRight());
        visit(tn);
    }
}

// class Other {
// public int i;
// }

// class Fruit {
// public void setDate(Object d) {
// System.out.println("Fruit.setDate(Object d)");
// }
// }
// class Apple extends Fruit {
// public void setDate(Date d) {
// System.out.println("Apple.setDate(Date d)");
// }
// }

// class Fruit {
// String name = "Fruit";
//
// public void print(int i) {
// System.out.println("Fruit" + i);
// }
// }
//
// class Apple extends Fruit {
// String name = "Apple";
//
// public void print(int i) {
// System.out.println("Apple" + i);
// }
// }
