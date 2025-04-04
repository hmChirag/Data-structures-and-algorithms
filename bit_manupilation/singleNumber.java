/*
 136. Single Number
Solved
Easy
Topics
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */


//this solution is valid for only duplicate elements present even number of times



package bit_manupilation;

public class singleNumber {

    public static int solution(int nums[]) {
        int uniqueNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            uniqueNumber = uniqueNumber ^ nums[i]; // we do and operator in order to make sure that the repeated numbers when did and with the 0 will result in 0 but not in case of the number which is not repeated in the array
        }
        return uniqueNumber;
    }

    public static void main(String[] args) {
        int nums[]={1,3,4,1,4,3,5,6,5};
        System.out.println(solution(nums));
    }
}
