package programming.Trees;
/*
Problem -> Given the root of a binary tree, return the length of the diameter of the tree.
           The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
           This path may or may not pass through the root.
           The length of a path between two nodes is represented by the number of edges between them.

Link -> https://leetcode.com/problems/diameter-of-binary-tree/description/

 */
public class TreeDiameter {
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
	static class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			if(root == null) return 0;
			int[] ans = new int[1];
			diameter(root,ans);
			return ans[0];
		}
		private int diameter(TreeNode node, int[] ans){
			if(node == null) return 0;
			int leftHeight = diameter(node.left,ans);
			int rightHeight = diameter(node.right,ans);
			ans[0] = Math.max(ans[0],leftHeight+rightHeight);
			return Math.max(leftHeight,rightHeight)+1;
		}
	}
}
