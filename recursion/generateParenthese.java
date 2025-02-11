/*
 * 22. Generate Parentheses
Solved
Medium
Topics
Companies
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8

 */

package recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParenthese {
    
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;        
    }
    private void solve(String curr,int open,int close,int total,List<String> ans){
        if(curr.length()==2*total){
            ans.add(curr);
            return;
        }
        if(open<total){
            solve(curr+"(",open+1,close,total,ans);
        }
        if(close<open){
            solve(curr+")",open,close+1,total,ans);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
