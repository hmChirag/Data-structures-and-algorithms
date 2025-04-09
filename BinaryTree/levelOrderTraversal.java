/*
 * 102. Binary Tree Level Order Traversal
Solved
Medium
Topics
Companies
Hint
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        
        if(root==null) return result;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){    

            int levelSize=q.size();
            List<Integer> list=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left); 
                }
                if(temp.right!=null){
                    q.add(temp.right); 
                }
            }
            result.add(list);
            
        }

        return result;
    }
    
    public static void main(String[] args) {
        
    }
}
