/*\
 * 25. Reverse Nodes in k-Group
Solved
Hard
Topics
Companies
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000
 
 */

package LinkedList;

public class reverseKgroupNodesinLL {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Create a dummy node to simplify edge cases (especially reversing the first group)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevNode = dummy;  // Points to the node before the current k-group
        ListNode temp = head;       // Tracks the first node in the k-group


        while (true) {
            
            ListNode kthNode = findKthNode(temp, k);
            if (kthNode == null) break; 

            // Store the next node after the k-group to reconnect later
            ListNode nextNode = kthNode.next;
            kthNode.next = null;  // Temporarily disconnect the k-group for proper reversal

            // Reverse the k-group and get the new head of this segment
            ListNode newHead = reverse(temp);
            
            // Connect the previous segment to the newly reversed segment
            prevNode.next = newHead;
            temp.next = nextNode; // Connect the last node of the reversed segment to nextNode

            // Move pointers forward for the next iteration
            prevNode = temp;
            temp = nextNode;
        }

        // Return the modified linked list, starting from dummy.next (new head)
        return dummy.next;
    }

    private ListNode reverse(ListNode temp){
        ListNode prev=null;
        ListNode curr=temp;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    private ListNode findKthNode(ListNode temp,int k){
        while(k>1 && temp!=null){
            temp=temp.next;
            k--;
        }
        return temp;
    }

    public static void main(String[] args) {
        
    }
}
