/*
 * 39. Combination Sum
Solved
Medium
Topics
Companies
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40
 */

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        findcombinations(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    
    private void findcombinations(int idx,int[] candidates,int target,List<List<Integer>> result,List<Integer> ds){
        if(idx==candidates.length){//base case when we are at the end of the array after checking a perticular combination
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }


        if(candidates[idx]<=target){
            ds.add(candidates[idx]);
            findcombinations(idx,candidates,target-candidates[idx],result,ds);    //recursion step when we picked  curr number for our comnbination
            ds.remove(ds.size()-1);     //this line helps in removing the elements which did not form the target using the backtracking principle   
        }
        findcombinations(idx+1,candidates,target,result,ds);         //recursion when we did not pickthe curr number
    } 
    
   

    public static void main(String[] args) {
    }
}