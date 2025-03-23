/*]
 * 61. Rotate List
Medium
Topics
Companies
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 */

package LinkedList;

public class rorateLL {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int len=1;
         if(head==null || head.next==null|| k ==0){
            return head;
        }

        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
       
        k=k % len;
        if(k==0){
            return head;
        }
        ListNode newTail=head;
        for(int i=0;i<len-k-1;i++){
            newTail=newTail.next;
        }
        //finding the bisection point and assigning the new tail to null
        ListNode newHead=newTail.next;
        newTail.next=null;
        
        //connecting the original tail node to the head to form the desired LL
        temp.next=head;

        return newHead;
    }
}
    
    public static void main(String[] args) {
        
    }
}
