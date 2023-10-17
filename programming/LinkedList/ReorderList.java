package programming.LinkedList;
/*
Link -> https://leetcode.com/problems/reorder-list/
problem -> You are given the head of a singly linked-list. The list can be represented as:
           L0 → L1 → … → Ln - 1 → Ln
           Reorder the list to be on the following form:

           L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
           You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Approach : Reverse the 2nd half of the list and then connect the first and second half
           linearly with every node to node at same or next position to reorder
           One iteration to get the mid
           half iteration to reverse the second half;
           half iteration to connect them

Complexity : time -> O(n)+O(n/2)+O(n/2) = O(n) , space -> O(1)

 */
public class ReorderList {

}
