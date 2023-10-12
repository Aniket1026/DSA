package programming.LinkedList;
// Link -> https://leetcode.com/problems/merge-two-sorted-lists/
// problem -> given two sorted LinkedLists merge them into one sorted list

// Intuition :
//      The smaller head between the two LinkedLists says my next will point to the head of the
//      mergedSorted List formed by list2 and remaining list1
//      This intuition sets the approach

// Approach : use recursion with following the intuition and pass the correct argument return the sortedList

public class Merge2SortedList {
	static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1==null) return list2;
		if(list2==null) return list1;
		if(list1.val < list2.val){
			list1.next = mergeTwoLists(list1.next,list2);
			return list1;
		}else{
			list2.next = mergeTwoLists(list1,list2.next);
			return list2;
		}
	}
}
