/*
 * 75. Sort Colors
Solved
Medium
Topics
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
 */




package arrays.sorting;

public class sortColors {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int index=0;
        for(int i=0;i<zero;i++){
            nums[i]=0;
            index++;
        }
        for(int j=0;j<one;j++){
            nums[index]=1;
            index++;
        }
        for(int j=0;j<two;j++){
            nums[index]=2;
            index++;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
