package programming.LinkedList;
// Link -> https://leetcode.com/problems/partition-list/description/
// Problem : Given the head of a linked list and a value x,
// partition it such that all nodes less than x come before nodes greater than or equal to x.
// You should preserve the original relative order of the nodes in each of the two partitions.

// Approach : Join all the smaller nodes with each other
//            join all the remaining i.e. equal or greater than value of x node together
//            Now, join the last of smaller nodes to the first of other nodes
//            and last of other nodes to null
//            return the new head which is the first node of all smaller nodes
//            Complexity -> time: linear , space: constant
public class Partition {
	 static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
		public ListNode partition(ListNode head, int x) {
			if(head==null || head.next==null) return head;
			ListNode start = head;
			ListNode larger = new ListNode(0);
			ListNode smaller =new ListNode(0);
			ListNode fsmaller=smaller;
			ListNode flarger = larger;

			while(start!=null){
				if(start.val<x){
					smaller.next=start;
					smaller=start;
				}else{
					larger.next=start;
					larger=start;
				}
				start=start.next;
			}

			larger.next=null;
			smaller.next = flarger.next;
			return fsmaller.next;
		}
	}
