/*
 * 92. Reverse Linked List II
Solved
Medium
Topics
Companies
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 

Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n
 
 */
package LinkedList;
public class reverseLLPartTwo {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode start=prev.next;
        ListNode curr=start.next;
        for(int i=0;i<right-left;i++){
            start.next=curr.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=start.next;
        }


        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
