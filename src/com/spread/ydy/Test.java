package com.spread.ydy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Test<E> {

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
        System.out.println(Utils.inOrderNormal(bt.getRoot()));
        System.out.println();
        System.out.println();

        Utils.postOrderCru(bt.getRoot());
        System.out.println();
        System.out.println(Utils.postOrderNormal(bt.getRoot()));
        System.out.println();
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

    public void setRoot(TreeNode mRoot) {
        this.mRoot = mRoot;
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