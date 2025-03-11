/*
 * 143. Reorder List
Solved
Medium
Topics
Companies
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 */


package LinkedList;
public class reorderLL {
    
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        //finding the mid of the ll
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reversing the second half of the ll
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //reorder the ll
        slow=head;
        fast=prev;
        while(fast.next!=null){
            ListNode temp1=slow.next;
            ListNode temp2=fast.next;

            slow.next=fast;
            fast.next=temp1;

            slow=temp1;//nothing else than slow=slow.next
            fast=temp2;//nothing else than fast=fast.next     but as the these val changes so we stored in temp1 adn temp2 and the made the nodes iterate one step
        }
    }
    
    public static void main(String[] args) {
        
    }
}
