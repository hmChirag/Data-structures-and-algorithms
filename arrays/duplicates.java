
/*Contains duplicates
-----------------------question(217 leetcode)--------------------------------------------->

 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

-----------------------------------------------------------------------------------------------
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109


-----------------------------------------------------------------------------------------------------

this code only works in the case of small and medium arrays but fails for very big arrays due to time complexity

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }
}

--------------------------------so we use hashset to decrease time complexity--------------------------------->>>>>

 */

package arrays;
import java.util.HashSet;


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> count = new HashSet<Integer>();
        for(int j=0;j<nums.length;j++){
            if(count.contains(nums[j])){
                return true;
            }
            count.add(nums[j]);
        }
        return false;
    }
}

public class duplicates {
    public static void main(String[] args) {
        
    }
}