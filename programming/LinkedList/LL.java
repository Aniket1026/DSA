package programming.LinkedList;

public class LL {
	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}
	public void insertFirst(int val){
		Node node = new Node(val);
		node.next=head;
		head = node;
		if(tail==null){
			tail=head;
		}
		size+=1;
	}
	public void insertLast(int val){
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	public void index(int val,int index){
		if(index<0){
			System.out.println("Index cannot be negative");
			return;
		}
		if(index>size){
			System.out.println("You cannot insert at index "+index+" since the size of the list is "+size);
			return;
		}
		if(index==0){
			insertFirst(val);
			return;
		}
		if(index==size){
			insertLast(val);
			return;
		}
		Node temp = head;
		for(int i=1;i<index;i++){
			temp = temp.next;
		}
//		System.out.println(temp.val);
//		System.out.println(temp.next.val);
		Node node = new Node(val,temp.next);// new node points to next element
		temp.next = node;//new node pointed by element at (index-1) position
		size++;
	}
	public int deleteFirst(){
		int val = head.val;
		head = head.next;
		if(head==null){
			tail=null;
		}
		size--;
		return val;
	}
	public int deleteLast(){
		if(size<=1){
          deleteFirst();
		}
		Node secondLast = get(size-2);
		int val = tail.val;
		tail =secondLast;
		tail.next=null;
		size--;
		return val;
	}
	public int delete(int index){
		if(index==0){
			deleteFirst();
		}
		if(index==size-1){
			deleteLast();
		}
		// write error handler
		// approach 1
//		Node node = get(index);
//		Node beforeNode = get(index-1);
//		Node afterNode = get(index+1);
//		int val = node.val;
//		node.next = null;
//		beforeNode.next = afterNode;
		Node prev = get(index-1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		return val;
	}

	public Node get(int index){
		Node node= head;
		for(int i=0;i<index;i++){
			node = node.next;
		}
		return node;
	}
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.val+" -> ");
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
	}
	private class Node{
		private int val;
		private Node next;

	    public Node(int val) {
		    this.val = val;
	    }

	    public Node(int val, Node next) {
		    this.val = val;
		    this.next = next;
	    }
    }
}
