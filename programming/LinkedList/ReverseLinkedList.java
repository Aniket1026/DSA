package programming.LinkedList;
// Link -> https://leetcode.com/problems/reverse-linked-list/
// problem -> reverse the linked list

//  You can use two approaches
// 1-> Using 3 pointers as curr , prev and next
//       curr is the current node you are reversing
//       prev is the previous node on to which current node would be pointing
//       next is the next node as when the current nodes reverses, it points to the prev node.
//       The link between current and next of current node gets broken and next is used
//       to access the next node

// 2-> Using recursion
// Use recursion and traverse to the last node and return it as this is going to be the newhead
// always return the newHead  which was the last node of given linked list
// In every call return the newhead but made changes in the nodes before returning the new head
// Change the current currentNode.next.next to point to the currentNode and CurrentNode.next to null
// draw on paper to visualize the steps

public class ReverseLinkedList {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
