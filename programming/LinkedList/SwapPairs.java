package programming.LinkedList;
// Link -> https://leetcode.com/problems/swap-nodes-in-pairs/
// problem -> swap every pair in LinkedList

// Approach :
// Recursive and iterative both are possible
// Recursive : Make every odd node swap the nodes but save every next even node and use this node to swap
// and return this even node
// swap only if pair is present otherwise just return . This was done in as base case
// use your brain to understand how base case handles odd cases

// Iterative:
// Use an extra node to get first and second node
// swap first and second in every iteration
// reset the extra node such that it helps find first and second in every iteration
// condition in the loop also checks for the swap only if pair is present
public class SwapPairs {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode temp = head.next;
		head.next = swapPairs(head.next.next);
		temp.next = head;
		return temp;
	}
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next ==null) return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode curr = dummy;

		while(curr.next!=null && curr.next.next!=null){
			ListNode first = curr.next;
			ListNode second = curr.next.next;
			curr.next = second;
			first.next = second.next;
			second.next = first;
			curr = curr.next.next;
		}
		return dummy.next;
	}
}
