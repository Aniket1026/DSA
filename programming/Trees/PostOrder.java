package programming.Trees;
import java.util.*;

/*
Link -> https://leetcode.com/problems/binary-tree-preorder-traversal/description/
Problem -> Given the root of a binary tree, return the preorder traversal of its nodes' values.

 */
public class PostOrder {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> postOrder = new ArrayList<>();
		  if (root == null) return postOrder;
		  Stack<TreeNode> stack = new Stack<>();
		  TreeNode curr = root;

		  while(curr != null || !stack.isEmpty()){
		     if(curr != null){
				 stack.push(curr);
				 curr = curr.left;
		     }else{
				 TreeNode temp = stack.peek().right;
				 if(temp == null){
					 temp = stack.peek();
					 stack.pop();
					 postOrder.add(temp.val);
					 while(!stack.isEmpty() && temp == stack.peek().right){
						 temp = stack.peek();
						 stack.pop();
						 postOrder.add(temp.val);
					 }
				 }else curr = temp;
		     }
		  }
		  return postOrder;
		}
	}
}
