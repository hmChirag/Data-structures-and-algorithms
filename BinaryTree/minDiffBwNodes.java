/*
 * 
Code
Testcase
Testcase
Test Result
783. Minimum Distance Between BST Nodes
Solved
Easy
Topics
Companies
Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [2, 100].
0 <= Node.val <= 105
 
 */

import javax.swing.tree.TreeNode;

public class minDiffBwNodes {
    
    private int minDiff = Integer.MAX_VALUE;
    TreeNode prev=null;

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return minDiff;
    }

    public void helper(TreeNode root){
        if(root==null) return;
  
        helper(root.left);
        if(prev!=null){
            minDiff=Math.min(minDiff,Math.abs(root.val-prev.val));
        }
        prev=root;
        helper(root.right);

    }
    public static void main(String[] args) {
        
    }
}
