package programming.Trees;
import java.util.*;

/*
problem -> We need to write a function allTraversals() which returns us three lists of a preorder,
           inorder and postorder traversals of the tree at the same time.
           We are not allowed to write separate codes for each traversal.
           We want all traversals in a single piece of code, in a single instance
Approach : Store the node in stack with a number which let us identify the state of traversal
           num == 1, indicates that node's preorder is executing
           num == 2, indicates that node's inorder is executing
           num == 3, indicates that we're in postorder

           if preorder is happening increment it's num value to indicate its preorder executed
           push the node back to stack and check for it's left to add another node

           if inorder is executing increment it's num value again to indicate it's inorder executed
           push the node back to stack and check for it's right node to add another node

           for postorder do nothing just add it to the list
 */
public class AllTraversal {
	static class  TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {
		}
		TreeNode(int val) {
			this.val = val;
		}
	}
	static class Pair{
		TreeNode node;
		int number;
		Pair(TreeNode node, int number){
			this.node = node;
			this.number = number;
		}
	}
	public static void main(String[] args) {

	}
	private static void allTraversals(TreeNode root, List < Integer > pre, List < Integer > in , List < Integer > post){
     Stack<Pair> stack = new Stack<>();
	 stack.push(new Pair(root,1));
	 if(root == null) return;

	 while(!stack.isEmpty()){
		Pair temp = stack.pop();

		if(temp.number==1){
		    pre.add(temp.node.val);
			temp.number++;
			stack.push(temp);
			if(temp.node.left != null) stack.push(new Pair(temp.node.left,1));
		 }else if(temp.number ==2){
              in.add(temp.node.val);
			  temp.number++;
			  stack.push(temp);
			  if(temp.node.right != null) stack.push(new Pair(temp.node.right,1));
		 } else post.add(temp.node.val);
	   }
	}
}
