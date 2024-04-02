/*  -----------242.-------------         Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

*/
package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        if(s1.length!=t1.length){
            return false;
        }
        Arrays.sort(t1);   
        Arrays.sort(s1); 
        for(int i=0;i<s1.length;i++){
            if(s1[i]==t1[i]){
                return true;
            }
        }  
        return false;
    }
}
public class valid_anagram {
    public static void main(String[] args) {
        
    }
}
