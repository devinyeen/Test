package com.spread.ydy.algorithms.binarytree.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.spread.ydy.algorithms.binarytree.structure.BinaryTree;
import com.spread.ydy.algorithms.binarytree.structure.TreeNode;

public class Utils {

    public static void visit(TreeNode node) {
        System.out.print(node.getValue() + " ");
    }

    /**
     * 递归先序遍历
     */
    public static void preOrderRecursion(TreeNode node) {
        if (node == null) // 如果结点为空则返回
            return;
        visit(node);// 访问根节点
        preOrderRecursion(node.getLeft());// 访问左孩子
        preOrderRecursion(node.getRight());// 访问右孩子
    }

    /**
     * 递归中序遍历
     */
    public static void inOrderRecursion(TreeNode node) {
        if (node == null) // 如果结点为空则返回
            return;
        inOrderRecursion(node.getLeft());// 访问左孩子
        visit(node);// 访问根节点
        inOrderRecursion(node.getRight());// 访问右孩子
    }

    /**
     * 递归中序遍历
     */
    public static void postOrderRecursion(TreeNode node) {
        if (node == null) // 如果结点为空则返回
            return;
        postOrderRecursion(node.getLeft());// 访问左孩子
        postOrderRecursion(node.getRight());// 访问右孩子
        visit(node);// 访问根节点
    }

    /**
     * 非递归先序遍历二叉树
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        if (root == null) // 如果为空树则返回
            return resultList;
        treeStack.push(root);
        while (!treeStack.isEmpty()) {
            TreeNode tempNode = treeStack.pop();
            if (tempNode != null) {
                resultList.add(tempNode.getValue());// 访问根节点
                treeStack.push(tempNode.getRight()); // 入栈右孩子
                treeStack.push(tempNode.getLeft());// 入栈左孩子
            }
        }
        return resultList;
    }

    /**
     * 非递归中序遍历
     */
    public static List<Integer> inorderTraversalNonCur(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.getLeft();
            }
            cur = stack.pop();
            list.add(cur.getValue());
            cur = cur.getRight();
        }

        return list;
    }

    /**
     * 非递归后序遍历
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                ret.add(node.getValue());
                stack.push(node.getLeft());
                stack.push(node.getRight());
            }
        }
        Collections.reverse(ret);
        return ret;
    }

    public static void buildTree(BinaryTree bt, TreeNode tn, int data) {
        TreeNode tnData = new TreeNode(data);
        if (null == bt.getRoot()) {
            bt.setRoot(tnData);
        } else {
            if (data < tn.getValue()) {
                if (null == tn.getLeft()) {
                    tn.setLeft(tnData);
                } else {
                    buildTree(bt, tn.getLeft(), data);
                }
            } else {
                if (null == tn.getRight()) {
                    tn.setRight(tnData);
                } else {
                    buildTree(bt, tn.getRight(), data);
                }
            }
        }
    }
}
