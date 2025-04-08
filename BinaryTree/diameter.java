/*
 * 543. Diameter of Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
 */

package BinaryTree;
public class diameter {


    //approach 1 brute force
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int height=Math.max(leftHeight,rightHeight)+1;
        return height;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftDiameter=diameterOfBinaryTree(root.left);
        int leftHeight=height(root.left);
        int rightDiameter=diameterOfBinaryTree(root.right);
        int rightHeight=height(root.right);

        int selfDiameter=leftHeight+rightHeight;

        return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
    }



    //aproach 2 optimized
    private int diameter=0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }
    private int depth(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftDia=depth(root.left);
        int rightDia=depth(root.right);

        diameter=Math.max(diameter,leftDia+rightDia);

        return 1+ Math.max(leftDia,rightDia);
    }
    public static void main(String[] args) {
        
    }
}