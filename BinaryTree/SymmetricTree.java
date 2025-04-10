/*
 * 101. Symmetric Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 */


import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(root);
        q2.add(root);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode temp1=q1.poll();
            TreeNode temp2=q2.poll();

            if (temp1 == null && temp2 == null) continue;

            if(temp1== null || temp2==null || temp1.val != temp2.val){
                return false;
            }
            q1.add(temp1.left);
            q1.add(temp1.right);
            q2.add(temp2.right);
            q2.add(temp2.left);

        }

        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
