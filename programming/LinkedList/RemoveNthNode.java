package programming.LinkedList;
// Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// problem statement is remove nth node from the end of the list

public class RemoveNthNode {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  	  public ListNode removeNthFromEnd(ListNode head, int n) {
	    // Brute force or say bad code bcz complexity is same

		//     if(head.next == null) return null;
		//    int size = 1;
		//    ListNode temp = head;
		//    while(temp.next!=null){
		//        temp=temp.next;
		//        size++;
		//    }
		//    int targetNode = size-n;
		//    temp = head;
		//    if(size==n){
		//        head = head.next;
		//        return head;
		//    }
		//    while(targetNode!=1){
		//        temp=temp.next;
		//        targetNode--;
		//    }
		//    temp.next = temp.next.next;
		//    return head;



		// This one is the better approach
		// Intuition : You have to find the targetNode which is the node just before the one you wanna remove.
		// If L is the total size of list and n is the node from end you wanna remove
		// Move one Node n times from head now you are n nodes forward from start
		// If L is the total size , so remaining nodes are (L-n)
		// If you observe your targetNode from start will always come out to (L-n)
		// Now move the first Node (L-n) times ahead
		// simultaneously move the second Node from start along with the First node
		// When first Node reaches end you can stop , meanwhile second node is at the targetNode
		// Once you had the targetNode rest is simple
		// A check is also added in case we wanted to remove the first node the return head.next

		ListNode fast = head;
		ListNode slow = head;

		for(int i=0;i<n;i++) fast = fast.next;
		if(fast == null) return head.next;

		while(fast.next !=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
