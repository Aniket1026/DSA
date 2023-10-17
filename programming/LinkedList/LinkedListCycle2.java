package programming.LinkedList;
/*
Link -> https://leetcode.com/problems/linked-list-cycle-ii/description/
problem -> Given the head of a linked list, return the node where the cycle begins.
           If there is no cycle, return null.

Fast pointer moves twice of slow pointer in the approach;
Approach : In a circular list of n nodes both slow and fast would again meet each other at the start only
           As slow will make n jumps and fast will make 2n jumps and meet at the start every time.
           (just as in a race track if someone is twice faster than you they will meet or cross you only at the start of the track)

           but if you have some L nodes before the cycle or (circular list)
           now before the slow pointer enters the cycle it makes extra L jumps meanwhile fast also makes L jumps
           and when the slow entered the cycle fast is already L nodes ahead
           Now fast is already L times ahead of slow
           If they had entered the cycle together fast would've caught the slow at the beginning as discussed earlier
           but now fast is already L jumps ahead so it will catch slow before the start by L nodes exactly
           They will meet each other L nodes from the start of the cycle
           And what was L again the extra nodes before cycle
           Now jumps from intersection point and start are equal to L
           move with same speed to meet again at the start
           I hope this made sense !!! :)

Complexity : time-> O(n) , space ->O(1)
 */

public class LinkedListCycle2 {

	  static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }

	public static class Solution {
		public ListNode detectCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;

			while(fast!=null && fast.next!=null){
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast){
					slow = head;
					while(slow!=fast){
						slow=slow.next;
						fast=fast.next;
					}
					return fast;
				}
			}
			return null;
		}
	}
}
