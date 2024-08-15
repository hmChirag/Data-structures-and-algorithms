
/*
 * 169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 
 */



public class majorityElement {
    
        public int majorityElement(int[] nums) {
            int candidate = 0;
            int count = 0;
    
            // Find the candidate for the majority element.
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
    
            // Since the problem assumes that a majority element always exists, we can return the candidate.
            return candidate;
        }
}


//see the tracing of this code in chatgpt