/*
 * 962. Maximum Width Ramp
Solved
Medium
Topics
Companies
A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.

Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.

 

Example 1:

Input: nums = [6,0,8,2,1,5]
Output: 4
Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
Example 2:

Input: nums = [9,8,1,0,1,9,4,0,4,1]
Output: 7
Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
 

Constraints:

2 <= nums.length <= 5 * 104
0 <= nums[i] <= 5 * 104
 */




package arrays.stacks;

import java.util.Stack;

public class MaximumWidthRamp {

    //brute force aproach
    public int maxWidthRamp(int[] nums) {
        int min=0;
        int max=0;
        int size=0;
        int width=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] <= nums[j]){
                    width=j-i;
                    size=Math.max(width,size);
                }
            }
        }
        return size;
    }

    //solution 2 using stack 
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length-1;i++){
            while(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }
        int maxWidth = 0;
        for(int j=nums.length-1;j>=0;j--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[j]){
                maxWidth=Math.max(maxWidth,j-stack.pop());
            }
        }
        return maxWidth;
    }
    public static void main(String[] args) {
        
    }
}
