package programming.Trees;

 class BST {
	public class Node{
		private int value;
		private int height;
		private Node left;
		private Node right;
		public Node(int value){
			this.value= value;
		}
		public int getValue(){
			return value;
		}
		private Node root;
		public void BST(){

		}
		public int height(Node node){
			if(node==null) return -1;
			return node.height;
		}
		public boolean isEmpty(){
			return root==null;
		}

		public Node insert(Node node , int value){
			if(node==null){
				Node temp = new Node(value);
				return temp;
			}
			if(node.value<value){
				node.left = insert(node.left,value);
			}else{
				node.right = insert(node.right,value);
			}
			node.height = Math.max(height(node.left),height(node.right))+1;
			return node;
		}
		public boolean balanced(){
			return  balanced(root);
		}
		private boolean balanced(Node node){
			if(node==null) return true;
			return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left)&&balanced(node.right);
		}
	}
}
