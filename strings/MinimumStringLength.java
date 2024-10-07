/*
 * 2696. Minimum String Length After Removing Substrings
Solved
Easy
Topics
Companies
Hint
You are given a string s consisting only of uppercase English letters.

You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

Return the minimum possible length of the resulting string that you can obtain.

Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.

 

Example 1:

Input: s = "ABFCACDB"
Output: 2
Explanation: We can do the following operations:
- Remove the substring "ABFCACDB", so s = "FCACDB".
- Remove the substring "FCACDB", so s = "FCAB".
- Remove the substring "FCAB", so s = "FC".
So the resulting length of the string is 2.
It can be shown that it is the minimum length that we can obtain.
Example 2:

Input: s = "ACBBD"
Output: 5
Explanation: We cannot do any operations on the string so the length remains the same.
 

Constraints:

1 <= s.length <= 100
s consists only of uppercase English letters.
 */


package strings;

public class MinimumStringLength {
    public static int minLength(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int i = 0; 
        
        // Traverse the array and check for "AB" or "CD" pairs
        while (i < len - 1) {
            if ((arr[i] == 'A' && arr[i + 1] == 'B') || (arr[i] == 'C' && arr[i + 1] == 'D')) {
                // If pair found, shift the rest of the array to the left by 2 positions
                for (int j = i + 2; j < len; j++) {
                    arr[j - 2] = arr[j];
                }
                len -= 2; // Decrease the length by 2 since we removed a pair
                i = Math.max(0, i - 1); // Move back one step to check for new adjacent pairs
            } else {
                i++; // Move to the next character if no pair found
            }
        }
        
        return len;
    }

    public static void main(String[] args) {
        
    }
}
