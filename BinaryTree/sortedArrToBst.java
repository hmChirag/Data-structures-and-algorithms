/*
 * 108. Convert Sorted Array to Binary Search Tree
Solved
Easy
Topics
Companies
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
 */

import BinaryTree.inorderTraversal.TreeNode;

public class sortedArrToBst {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0;
        int end=nums.length;
        TreeNode node=helper(nums,start,end);
        return node;
    }

    public TreeNode helper(int[] nums,int start,int end){
        if(start>=end) return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,start,mid);
        root.right=helper(nums,mid+1,end);
        return root;
    }
    
    
    public static void main(String[] args) {
        
    }
}
