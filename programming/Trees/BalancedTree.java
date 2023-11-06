package programming.Trees;
/*
Problem -> Given a binary tree, determine if it is height-balanced
Link -> https://leetcode.com/problems/balanced-binary-tree/

 */
public class BalancedTree {
	static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
 }
}
// Brute force approach with O(n^2)
	static class  Solution {
		public boolean isBalanced(TreeNode root) {
			if(root == null) return true;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			if(Math.abs(leftHeight - rightHeight)>1) return false;
			boolean left = isBalanced(root.left);
			boolean right = isBalanced(root.right);
			return (left && right);
		}
		private int height(TreeNode node){
			if(node == null) return 0;
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			return Math.max(rightHeight,leftHeight)+1;
		}
	}

	// Optimized linear complexity approach
	public boolean isBalanced(TreeNode root) {
		if(root==null) return true;
		if(balanced(root)==-1) return false;
		return true;
	}
	public int balanced(TreeNode node) {
		if(node == null) return 0;
		int leftHeight = balanced(node.left);
		int rightHeight = balanced(node.right);
		if(leftHeight==-1 || rightHeight==-1) return -1;
		if(Math.abs(leftHeight-rightHeight)>1) return -1;
		return Math.max(leftHeight,rightHeight)+1;
	}
}
