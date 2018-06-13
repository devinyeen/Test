package com.spread.ydy.algorithms.binarytree.structure;

public class TreeNode {
    private int mValue;
    private TreeNode mLeft;
    private TreeNode mRight;

    public void setValue(int mValue) {
        this.mValue = mValue;
    }

    public void setLeft(TreeNode mLeft) {
        this.mLeft = mLeft;
    }

    public void setRight(TreeNode mRight) {
        this.mRight = mRight;
    }

    public int getValue() {
        return mValue;
    }

    public TreeNode getLeft() {
        return mLeft;
    }

    public TreeNode getRight() {
        return mRight;
    }

    public TreeNode(int x) {
        mValue = x;
    }

    @Override
    public String toString() {
        return "val: " + mValue;
    }
}