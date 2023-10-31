package programming.Trees;
import java.util.*;
/*
Link -> https://leetcode.com/problems/binary-tree-preorder-traversal/description/
Problem -> Given the root of a binary tree, return the preorder traversal of its nodes' values
approach : Add root to stack and then iteratively pop the top of stack and after this add the
           left and right of the stack. Repeat till stack becomes empty
*/
public class PreOrder {
	  public class TreeNode {
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

	class Solution {
		public List<Integer> preorderTraversal(TreeNode root) {
			ArrayList<Integer> list = new ArrayList<>();
			if(root == null) return list;
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);

			while(!stack.isEmpty()){
				TreeNode node = stack.pop();
				list.add(node.val);
				if(node.right != null) stack.push(node.right);
				if(node.left != null) stack.push(node.left);
			}
			return list;
		}
	}
}
