package com.spread.ydy.algorithms.binarytree;

import static com.spread.ydy.algorithms.binarytree.utils.Utils.buildTree;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.inOrderRecursion;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.inorderTraversalNonCur;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.postOrderRecursion;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.postorderTraversal;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.preOrderRecursion;
import static com.spread.ydy.algorithms.binarytree.utils.Utils.preorderTraversal;

import com.spread.ydy.algorithms.binarytree.structure.BinaryTree;

public class TreeTest {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] a = { 6, 2, 0, 1, 4, 5, 8, 9 };
        for (int i = 0; i < a.length; i++) {
            buildTree(bt, bt.getRoot(), a[i]);
        }

        preOrderRecursion(bt.getRoot());
        System.out.println();
        System.out.println(preorderTraversal(bt.getRoot()));
        System.out.println();
        inOrderRecursion(bt.getRoot());
        System.out.println();

        System.out.println(inorderTraversalNonCur(bt.getRoot()));
        System.out.println();
        postOrderRecursion(bt.getRoot());
        System.out.println();
        System.out.println(postorderTraversal(bt.getRoot()));
    }

}
