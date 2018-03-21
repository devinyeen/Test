package com.spread.ydy.algorithms.binarytree;

public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public BinaryTree() {
        root = null;
    }

    public void buildTree(TreeNode tn, int data) {
        TreeNode tnData = new TreeNode(data);
        if (null == root) {
            root = tnData;
        } else {
            if (data < tn.mvalue) {
                if (null == tn.mLeft) {
                    tn.mLeft = tnData;
                } else {
                    buildTree(tn.mLeft, data);
                }
            } else {
                if (null == tn.mRight) {
                    tn.mRight = tnData;
                } else {
                    buildTree(tn.mRight, data);
                }
            }
        }
    }

    public class TreeNode {
        private int mvalue;
        private TreeNode mLeft;
        private TreeNode mRight;

        public int getVal() {
            return mvalue;
        }

        public TreeNode getLeft() {
            return mLeft;
        }

        public TreeNode getRight() {
            return mRight;
        }

        TreeNode(int x) {
            mvalue = x;
        }

        @Override
        public String toString() {
            return "val: " + mvalue;
        }
    }

}
