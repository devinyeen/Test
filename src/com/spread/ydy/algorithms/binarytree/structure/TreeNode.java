package com.spread.ydy.algorithms.binarytree.structure;

public class TreeNode {
<<<<<<< HEAD
    private int mValue;

    public void setValue(int mValue) {
        this.mValue = mValue;
    }
=======
	private int mValue;
	private TreeNode mLeft;
	private TreeNode mRight;

	public void setValue(int mValue) {
		this.mValue = mValue;
	}
>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git

    public void setLeft(TreeNode mLeft) {
        this.mLeft = mLeft;
    }

    public void setRight(TreeNode mRight) {
        this.mRight = mRight;
    }

<<<<<<< HEAD
    private TreeNode mLeft;
    private TreeNode mRight;
=======
	public int getValue() {
		return mValue;
	}
>>>>>>> branch 'HEAD' of https://github.com/devinyeen/Test.git

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