/*
 * 110. Balanced Binary Tree
Solved
Easy
Topics
Companies
Given a binary tree, determine if it is height-balanced.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 
 */

import javax.swing.tree.TreeNode;

public class balancedBinaryTree {
    
    public boolean isBalanced(TreeNode root) {      
        int height=calHeight(root);
        if(height==-1) return false;
        return true;    
    }
    public int calHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight=calHeight(root.left);
        int rightHeight=calHeight(root.right);
        if(leftHeight ==-1 || rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1) return -1;

        return 1+ Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args) {
        
    }
}
