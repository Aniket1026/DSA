package programming.LinkedList;
/*
Link -> https://leetcode.com/problems/remove-linked-list-elements/description/
Problem -> Given the head of a linked list and an integer val, remove all the nodes of the linked list
           that has Node.val == val, and return the new head.

Approach : Point to the other header as one pointer reaches end while traversing because this way they
           travel equal nodes and meet at the start of the intersection
 */
public class RemoveElements {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode curr = dummy.next;
		ListNode prev = dummy;

		while(curr != null){
			if(curr.val == val)
				prev.next = curr.next;
			else prev = curr;
			curr = curr.next;
		}
		return dummy.next;
	}
}
