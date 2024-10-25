/*
 * 205. Isomorphic Strings
Solved
Easy
Topics
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true

 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */


package arrays;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] maps=new int[256];
        int[] mapt=new int[256];

        for(int i=0;i<s.length();i++){
            char chars=s.charAt(i);
            char chart=t.charAt(i);
            if(maps[chars]!=mapt[chart]){
                return false;
            }

            maps[chars]=i+1;
            mapt[chart]=i+1;
        }
        return true;
        
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         count1+=1;
        //     }
        //     if(t.charAt(i)==t.charAt(i+1)){
        //         count2+=1;
        //     }
        //     if(count1!=count2){
        //         return false;
        //     }
        // }
        // return true;
        // int[] arr1=new int[26];
        // int[] arr2=new int[26];
        // for(char c:s.toCharArray()){
        //     arr1[c-'a']=1;
        // }
        // for(char c:t.toCharArray()){
        //     arr2[c-'a']=1;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr1[i]==1){
        //         count1+=1;
        //     }
        //     if(arr2[i]==1){
        //         count2+=1;
        //     }
        // }

        // if(count1==count2){
        //     return true;
        // }
        // return false;
    }
    public static void main(String[] args) {
        
    }
}
