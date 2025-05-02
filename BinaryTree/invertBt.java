/*
 * 226. Invert Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, invert the tree, and return its root.

 

Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */




import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class invertBt {
    
     public TreeNode invertTree(TreeNode root) {
        
//recursive aproach

        if(root==null) return null;
        
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        
        root.left=right;
        root.right=left;
        
        return root;


 //lvl order technique implimentation
        if(root==null) return null;
       
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode test=q.poll();

            TreeNode temp=test.left;
            test.left=test.right;
            test.right=temp;

            if(test.left!=null) q.add(test.left);
            if(test.right!=null) q.add(test.right);

        }
        return root;
    }
    
    public static void main(String[] args) {
        
    }
}
