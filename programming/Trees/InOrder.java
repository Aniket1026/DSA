package programming.Trees;
import java.util.*;

/*
Link -> https://leetcode.com/problems/binary-tree-inorder-traversal/
Problem -> Given the root of a binary tree, return the inorder traversal of its nodes' values

Approach -> Add all the left nodes to stack initially and pop them and add to stack
            while adding the popped node to stack add the left nodes of the right node of the previously
            added node to the stack
            Sounds confusing but do a dry run to understand it
 */
public class InOrder {
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
		public List<Integer> inorderTraversal(TreeNode root) {
			ArrayList<Integer> list = new ArrayList<>();
			if(root == null) return list;
			Stack<TreeNode> stack = new Stack<>();
			pushAllLeft(root,stack);

			while(!stack.isEmpty()){
				TreeNode curr = stack.pop();
				list.add(curr.val);
				pushAllLeft(curr.right,stack);
			}
			return list;
		}
		private void pushAllLeft(TreeNode node , Stack<TreeNode> stack){
			while(node != null){
				stack.push(node);
				node = node.left;
			}
		}
	}
}
