/*
 * 896. Monotonic Array
Solved
Easy
Topics
Companies
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 

Constraints:

1 <= nums.length <= 105
-105 <= nums[i] <= 105
 */

package arrays;

public class MonotonicArray {
    
    public boolean isMonotonic(int[] A) {
        boolean inc=true;
        boolean desc=true;
        for(int i=0;i<A.length-1;i++){
            if(A[i] > A[i+1]){
                inc=false;
            }
            if(A[i] < A[i+1]){
                desc=false;
            }
        }
        return inc || desc;
    }
    
    public static void main(String[] args) {
        
    }
}
