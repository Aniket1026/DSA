package programming.LinkedList;

public class DoublyLL {
	   private Node head;
	   private int size;
	   private Node tail;

	public DoublyLL() {
		this.size = 0;
	}

	public void insertFirst(int val){
		   Node node = new Node(val);
		   node.prev=null;
		   node.next=head;
		   if(head!=null) head.prev=node;
		   if(tail==null) tail=head;
		   head = node;
		   size++;
	   }

	   public void insertLast(int val){
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node temp = new Node(val);
		temp.next=null;
		temp.prev=tail;
		tail.next=temp;
		size++;
	   }
	   public void insert(int val, int index){
		   if(index==0){
			   insertFirst(val);
			   return;
		   }if(index==size-1){
			   insertLast(val);
			   return;
		   }
		   Node node = new Node(val);
		   Node beforeNode = get(index-1);
		   node.prev=beforeNode;
		   node.next=beforeNode.next;
		   beforeNode.next.prev=node;
		   beforeNode.next = node;
	   }
	   public Node get(int index){
		Node node = head;
		for(int i=0;i<index;i++){
			node=node.next;
		}
		return node;
	   }
	   public void display(){
        Node temp = head;
		while(temp!=null){
			System.out.print(temp.val+" -> ");
			temp=temp.next;
		}
		   System.out.println("END");
		   System.out.println();
	   }

	   public void displayReverse(){
		Node temp = tail;
		while(temp!=null){
			System.out.print(temp.val+" -> ");
		    temp= temp.prev;
		}
		   System.out.println("START");
		   System.out.println();
	   }
       private class Node{
		   private int val;
		   private Node next;
		   private Node prev;

	       public Node(int val) {
		       this.val = val;
	       }

	       public Node(int val, Node next, Node prev) {
		       this.val = val;
		       this.next = next;
		       this.prev = prev;
	       }
       }
}
