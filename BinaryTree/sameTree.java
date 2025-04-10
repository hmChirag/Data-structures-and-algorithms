
/*
 * 100. Same Tree
Solved
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class sameTree {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();

        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode temp1=q1.poll();
            TreeNode temp2=q2.poll();

            if(temp1==null && temp2==null) continue;

            if(temp1==null || temp2 ==null || temp1.val!=temp2.val){
                return false;
            }

            q1.add(temp1.left);
            q1.add(temp1.right);
            q2.add(temp2.left);      
            q2.add(temp2.right);

        }

        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
