package programming.LinkedList;
// Link -> https://leetcode.com/problems/rotate-list/description/
// problem -> rotate the list if you don't know rotate then check how a number is rotated

// Approach : rotate list k times is similar to remove nth node from the last only difference
//            is now the last node point to the head and return the new head\
//            If you can solve the remove the nth node from last then this would be easy
//            Also if the list is o size n and you rotate a list n times it becomes the original list
//            Use this fact to reduce the running of the loop by taking modulo
//            Time : O(n) , space : O(1)
public class RotateList {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	public ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null) return head;
		ListNode temp = head;
		int size =1;
		while(temp.next!=null){
			temp=temp.next;
			size++;
		}
		k=k%size;
		temp.next = head;
		int count =1;
		ListNode prev =head;
		while(count<size-k){
			prev = prev.next;
			count++;
		}
		temp = prev.next;
		prev.next=null;
		return temp;
	}
}
