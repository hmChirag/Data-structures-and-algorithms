/*
 * 572. Subtree of Another Tree
Solved
Easy
Topics
Companies
Hint
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

 

Example 1:


Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
Example 2:


Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false
 

Constraints:

The number of nodes in the root tree is in the range [1, 2000].
The number of nodes in the subRoot tree is in the range [1, 1000].
-104 <= root.val <= 104
-104 <= subRoot.val <= 104
 */





 

public class subTree {
    

    //function to cehck if the initial root node of subTree is matching to the root node of main tree
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        
        if(root.val==subRoot.val){
            if(isIdenticle(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    
    //function to check if the two trees are identical after getting to know that the root node of both trees are same
    public boolean isIdenticle(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        else if(root==null || subRoot ==null || root.val!=subRoot.val){
            return false;
        }

        if(!isIdenticle(root.left,subRoot.left)){
            return false;
        }
        if(!isIdenticle(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
    }
}
