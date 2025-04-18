/*
 * 1161. Maximum Level Sum of a Binary Tree
Solved
Medium
Topics
Companies
Hint
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

 

Example 1:


Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation: 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-105 <= Node.val <= 105
 */

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MaxSumOfNodesBt {
    
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int level=1;
        int maxLevel=1;
        int maxSum=Integer.MIN_VALUE;
        if(root==null) return 0;
        q.offer(root);
        
         while(!q.isEmpty()){
            int levelSize=q.size();
            int total=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node=q.poll();
                total+=node.val;

                if(node.left!=null){
                    q.offer(node.left);
    
                } 
                if(node.right!=null){
                    q.offer(node.right);
                    
                } 
            } 
             if (total > maxSum) {
                    maxSum = total;
                    maxLevel = level;
                }
            level++;
        }
        return maxLevel;
    }
    
    public static void main(String[] args) {
        
    }
}
