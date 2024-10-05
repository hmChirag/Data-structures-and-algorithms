/*
 * 567. Permutation in String
Solved
Medium
Topics
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a 
permutation
 of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 */

package string;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int[] first=new int[26],second=new int[26];
        for(char c:s1.toCharArray()){
            first[c-'a']+=1;
        }
        int window=s1.length()-1;
        for(int i=0;i<s2.length();i++){
            second[s2.charAt(i)-'a']+=1;
            if(i>=window){
                if(match(first,second)) return true;
                second[s2.charAt(i-window)-'a']-=1;
            }
        }
        return false;
    }
    private boolean match(int first[],int second[]){
        for(int i=0;i<26;i++){
            if(first[i]!=second[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
