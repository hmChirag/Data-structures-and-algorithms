/*
 * 234. Palindrome Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
 */


package LinkedList;


public class isLLpalindrome {
    
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
        }
 
        boolean res=false;
        
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=null;
         while(curr!=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
         }
 
         ListNode first=head;
         ListNode second=prev;
         while(second!=null){
             if(first.val!=second.val){
                 return false;
             }
             first=first.next;
             second=second.next;
         }
 
         return true;
     }
    
    public static void main(String[] args) {
        
    }
}
