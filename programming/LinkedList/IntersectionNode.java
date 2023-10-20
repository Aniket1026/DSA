package programming.LinkedList;
/* Link -> https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 problem -> Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
            If the two linked lists have no intersection at all, return null.

Approach : In order to meet at the intersection they need to cover equal nodes before coming at intersection
But the nodes before intersection may vary. So as soon as one head reaches its end point to the head of
other node. This way they both would cover same distance before intersection

 */
public class IntersectionNode {
 static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA ==null || headB == null) return null;
		ListNode a = headA;
		ListNode b = headB;

		while(a != b){
			a = a==null ? headB:a.next;
			b = b==null? headA:b.next;
		}
		return a;
	}
}
