/*
 * 229. Majority Element II
Solved
Medium
Topics
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

package arrays;
import java.util.*;
import java.util.ArrayList;

public class majorityElement2{
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]) count++;
            }
            if(count>nums.length/3) list.add(nums[i]);
            if(list.size()==2) break;
        }
        return list;
    }

    public static void main(String[] args) {
        
    }
}
