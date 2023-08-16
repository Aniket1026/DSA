package programming.Trees;

import java.util.Scanner;

public class BinaryTree {
	private static class Node{
		int val;
		Node left;
		Node right;
		public Node (int val){
			this.val = val;
		}
	}
	private Node root;

	public void populate(Scanner scanner){
		System.out.println("Enter the root Node : ");
		int val = scanner.nextInt();
		root = new Node(val);
		populate(scanner,root);
	}
	private void populate(Scanner scanner,Node node){
		System.out.println("Do you want to enter the left of "+node.val);
		boolean left = scanner.nextBoolean();
		if(left){
			System.out.println("Enter the left node of "+node.val);
			int val = scanner.nextInt();
			node.left = new Node(val);
			populate(scanner,node.left);
		}
		System.out.println("Do you want to enter the right of "+node.val);
		boolean right = scanner.nextBoolean();
		if(right){
			System.out.println("Enter the right node of "+node.val);
			int val = scanner.nextInt();
			node.right = new Node(val);
			populate(scanner,node.right);
		}
	}
	public void display(){
		display(root,"");
	}
	private void display(Node node,String indent){
		if(node==null){
			return;
		}
		System.out.println(indent+node.val);
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
	}
	public void prettyDisplay(){
		prettyDisplay(root,0);
	}
	private void prettyDisplay(Node node , int level){
		if(node==null) return;
		prettyDisplay(node.right,level+1);
		if(level!=0){
          for(int i=0;i<level-1;i++){
	          System.out.print("|\t\t");
           }
			System.out.println("-------->"+node.val);
		}else {
			System.out.println(node.val);
		}
		prettyDisplay(node.left,level+1);
	}
}
