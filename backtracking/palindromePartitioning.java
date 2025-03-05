/*
 * 131. Palindrome Partitioning
Solved
Medium
Topics
Companies
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
 */

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        solve(0,s,result,new ArrayList<>());
        return result;
    }
    private void solve(int start,String s,List<List<String>> result,List<String> storage){
        if(start==s.length()){
            result.add(new ArrayList<>(storage));
            return;
        }
        
        for(int end=start;end<s.length();end++){
            if(palindrome(s,start,end)){
                storage.add(s.substring(start,end+1));
                solve(end+1,s,result,storage);
                storage.remove(storage.size()-1);
            }
        }
        
    }

    private boolean palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
