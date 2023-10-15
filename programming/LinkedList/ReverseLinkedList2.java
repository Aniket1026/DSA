package programming.LinkedList;

// Link -> https://leetcode.com/problems/reverse-linked-list-ii/description/
// problem : reverse a linked list provided a range as left and right reverse the list only within the range
// Approach: Go the pointer just before the left and save it as leftTail
//           Reverse the linked list within range
//           After reverse leftTail will point to the last of reversed linked list which is prev here
//           The first i.e. left will point to the next of right i.e. curr;
public class ReverseLinkedList2 {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null || head.next == null || left == right) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode leftTail = findNode(dummy, left - 1);
		ListNode rightNode = findNode(dummy, right);

		ListNode newHead = reverseSegment(leftTail.next, rightNode.next);
		leftTail.next = newHead;
		return dummy.next;
	}
	 private ListNode findNode(ListNode start, int steps) {
	     if (steps == 0) return start;
	     return findNode(start.next, steps - 1);
	 }

	 private ListNode reverseSegment(ListNode start, ListNode end) {
	     if (start == end || start.next == end) return start;

	     ListNode newHead = reverseSegment(start.next, end);
	     start.next.next = start;
	     start.next = end;

	     return newHead;
	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null || head.next == null || left == right) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode leftTail = findNode(dummy, left - 1);
		ListNode rightNode = findNode(dummy, right);

		ListNode newHead = reverseSegment(leftTail.next, rightNode.next);
		leftTail.next = newHead;

		return dummy.next;
	}

	private ListNode findNode(ListNode start, int steps) {
		for (int i = 0; i < steps; i++) {
			start = start.next;
		}
		return start;
	}

	private ListNode reverseSegment(ListNode start, ListNode end) {
		ListNode prev = null;
		ListNode curr = start;
		ListNode next;

		while (curr != end) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		start.next = end;
		return prev;
	}
}
