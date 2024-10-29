/*
 * 18. 4Sum
Solved
Medium
Topics
Companies
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums==null || nums.length<4 ) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){

            if( i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int lp=j+1;
                int rp=nums.length-1;
                while(lp<rp){
                    long sum=(long)nums[i]+nums[lp]+nums[rp]+nums[j];
                    if(sum==(long)target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[lp],nums[rp]));
                        rp--;
                        lp++;
                        while(lp<rp && nums[lp]==nums[lp-1]) lp++;
                        while(lp<rp && nums[rp]==nums[rp+1]) rp--;
                    }else if(sum<target){
                        lp++;
                    }else{
                        rp--;
                    }
                }   
            }
        }
    return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        
    }
    
}
