/*
 * 1721. Swapping Nodes in a Linked List
Solved
Medium
Topics
Companies
Hint
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
 */



 
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
public class swapTwoNodes {


    public ListNode swapNodes(ListNode head, int k) {
        ListNode start, end, temp;
        int len=0;
        temp=head;
        while(temp != null){
            temp=temp.next;
            len++;
        }
        start=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        end=head;
        for(int i=1;i<len-k+1;i++){
            end=end.next;
        }
        int res;
        res=start.val;
        start.val=end.val;
        end.val=res;
        return head;
    }

    
    public static void main(String[] args) {
        
    }
}
