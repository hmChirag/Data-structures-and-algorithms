/*
 * 90. Subsets II
Solved
Medium
Topics
Companies
Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
 */

package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsPartTwo {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(nums);
        solution(0,nums,result,new ArrayList<>());
        return result;
    }

    private void solution(int start,int[] nums,List<List<Integer>> result,List<Integer> storage){
        if(!result.contains(storage)){
            result.add(new ArrayList<>(storage));
        }
        
        for(int end=start;end<nums.length;end++){
            storage.add(nums[end]);
            solution(end+1,nums,result,storage);
            storage.remove(storage.size()-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
