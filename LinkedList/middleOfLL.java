/*
 * 876. Middle of the Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

 */

package LinkedList;

public class middleOfLL {
    
    public ListNode middleNode(ListNode head){
        int len=0;
        ListNode temp;
        temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int mid=len/2;
        ListNode copy;
        copy=head;
        for(int i=0;i<mid;i++){
            copy=copy.next;
        }
        return copy;
    }
    
    public static void main(String[] args) {
        
    }
}
