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
			if (data < tn.val) {
				if (null == tn.left) {
					tn.left = tnData;
				} else {
					buildTree(tn.left, data);
				}
			} else {
				if (null == tn.right) {
					tn.right = tnData;
				} else {
					buildTree(tn.right, data);
				}
			}
		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "val: " + val;
		}
	}

	
}
