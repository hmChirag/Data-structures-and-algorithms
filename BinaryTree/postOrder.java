/*
 * 145. Binary Tree Postorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [3,2,1]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,6,7,5,2,9,8,3,1]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 

Constraints:

The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
 */






/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */ 


package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class postOrder {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postorderTraversalHelper(root,list);
        return list;
    }

    public void postorderTraversalHelper(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        postorderTraversalHelper(root.left,list);
        postorderTraversalHelper(root.right,list);
        list.add(root.val);
    }
    public static void main(String[] args) {
        
    }
}
