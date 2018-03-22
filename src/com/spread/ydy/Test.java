package com.spread.ydy;

import java.util.ArrayList;
import java.util.Collections;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git
import java.util.List;
import java.util.Stack;

public class Test<E> {

<<<<<<< HEAD
=======
    // private static String mQuery = "abc defg hijkl";
    // private static String SPACE = " ";

>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        int[] a = { 6, 4, 2, 1, 3, 5, 10, 8, 7, 9, 11 };

        for (int i = 0; i < a.length; i++) {
            Utils.buildTree(bt, bt.getRoot(), a[i]);
        }
        Utils.preOrderCru(bt.getRoot());
        System.out.println();
        System.out.println(Utils.preOrderNormal(bt.getRoot()));
        System.out.println();

        Utils.inOrderCru(bt.getRoot());
        System.out.println();
<<<<<<< HEAD
        System.out.println(Utils.inOrderNormal(bt.getRoot()));
        System.out.println();
        System.out.println();

        Utils.postOrderCru(bt.getRoot());
        System.out.println();
        System.out.println(Utils.postOrderNormal(bt.getRoot()));
        System.out.println();
=======
        System.out.println(BinaryTree.inOrderNormal(bt.getRoot()));
        System.out.println();
        BinaryTree.postOrderCru(bt.getRoot());
        System.out.println();
        System.out.println(BinaryTree.postOrderNormal(bt.getRoot()));
>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git
    }

}

class Utils {
    public static void buildTree(BinaryTree bt, TreeNode root, int data) {
        TreeNode tnInsert = new TreeNode(data);
        if (bt.getRoot() == null) {
            bt.setRoot(tnInsert);
        } else {
            if (data < root.getValue()) {
                if (root.getLeft() == null) {
                    root.setLeft(tnInsert);
                } else {
                    buildTree(bt, root.getLeft(), data);
                }
            } else {
                if (root.getRight() == null) {
                    root.setRight(tnInsert);
                } else {
                    buildTree(bt, root.getRight(), data);
                }
            }
        }
    }

    public static void preOrderCru(TreeNode root) {
        if (null == root)
            return;
        visit(root);
        preOrderCru(root.getLeft());
        preOrderCru(root.getRight());
    }

    public static List<Integer> preOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return results;
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root != null) {
                results.add(root.getValue());
                stack.push(root.getRight());
                stack.push(root.getLeft());
            }
        }
        return results;
    }

    public static void inOrderCru(TreeNode root) {
        if (null == root)
            return;
        inOrderCru(root.getLeft());
        visit(root);
        inOrderCru(root.getRight());
    }

    public static List<Integer> inOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode tn = root;
        while(tn != null || !stack.isEmpty()) {
            while(tn!=null) {
                stack.push(tn);
                tn = tn.getLeft();
            }
            tn = stack.pop();
            results.add(tn.getValue());
            tn = tn.getRight();
        }
        return results;
    }

    public static void postOrderCru(TreeNode root) {
        if (null == root)
            return;
        postOrderCru(root.getLeft());
        postOrderCru(root.getRight());
        visit(root);
    }

    public static List<Integer> postOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return results;
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root != null) {
                results.add(root.getValue());
                stack.push(root.getLeft());
                stack.push(root.getRight());
            }
        }
        Collections.reverse(results);
        return results;
    }

    public static void visit(TreeNode tn) {
        System.out.print(tn.getValue() + " ,");
    }
}

class BinaryTree {
    public BinaryTree() {
        mRoot = null;
    }

    private TreeNode mRoot;

    public TreeNode getRoot() {
        return mRoot;
    }

<<<<<<< HEAD
    public void setRoot(TreeNode mRoot) {
        this.mRoot = mRoot;
=======
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
        System.out.print(tn.getValue() + ", ");
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
        while (!stack.isEmpty()) {
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
        TreeNode tnCur = tn;

        while(!(tnCur == null && stack.empty())) {
            while(tnCur != null) {
                stack.push(tnCur);
                tnCur = tnCur.getLeft();
            }
            tnCur = stack.pop();
            results.add(tnCur.getValue());
            tnCur = tnCur.getRight();
        }

        return results;
    }

    public static void postOrderCru(TreeNode tn) {
        if (null == tn)
            return;
        postOrderCru(tn.getLeft());
        postOrderCru(tn.getRight());
        visit(tn);
>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git
    }

    public static List<Integer> postOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (tn == null)
            return results;
        stack.push(tn);

        while (!stack.isEmpty()) {
            tn = stack.pop();
            if (null != tn) {
                results.add(tn.getValue());
                stack.push(tn.getLeft());
                stack.push(tn.getRight());
            }
        }
        Collections.reverse(results);
        return results;
    }
}

class TreeNode {
    private int      mValue;
    private TreeNode mLeft;
    private TreeNode mRight;

    public TreeNode(int value) {
        this.mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int mValue) {
        this.mValue = mValue;
    }

    public TreeNode getLeft() {
        return mLeft;
    }

    public void setLeft(TreeNode mLeft) {
        this.mLeft = mLeft;
    }

    public TreeNode getRight() {
        return mRight;
    }

    public void setRight(TreeNode mRight) {
        this.mRight = mRight;
    }

}