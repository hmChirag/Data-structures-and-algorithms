/*
 * 14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */



package strings;

import java.util.Arrays;

public class CommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        String temp = strs[0];
        String temp2 = strs[strs.length - 1];
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < temp.length(); i++) {
            if (i < temp2.length() && temp.charAt(i) == temp2.charAt(i)) {
                res.append(temp.charAt(i));
            } else {
                break;
            }
        }
        
        return res.toString();
    
    }
    public static void main(String[] args) {
        
    }
}
