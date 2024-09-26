
/*
 * 58. Length of Last Word
Solved
Easy
Topics
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */


 
package arrays;
public class lastWord {

    public static int lengthOfLastWord(String s) {
        String hosadu=s.trim();
        int word=0;
        int len=hosadu.length();
        System.out.println(hosadu);
        for (int i=len-1;i>=0;i--){
            if (hosadu.charAt(i)==' '){
                break;
            }else {
                word+=1;
            }
        }
        return word;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  chii  bro   "));
    }
}
