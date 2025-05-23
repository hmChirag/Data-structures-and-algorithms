/*
 * 19. Remove Nth Node From End of List
Solved
Medium
Topics
Companies
Hint
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */


public class deleteNodeFromend {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(head==null){
            return null;
        }
        
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast.next==null){
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    
    public static void main(String[] args) {
        
    }
}
