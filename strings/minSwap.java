/*
 * 1963. Minimum Number of Swaps to Make the String Balanced
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.

A string is called balanced if and only if:

It is the empty string, or
It can be written as AB, where both A and B are balanced strings, or
It can be written as [C], where C is a balanced string.
You may swap the brackets at any two indices any number of times.

Return the minimum number of swaps to make s balanced.

 

Example 1:

Input: s = "][]["
Output: 1
Explanation: You can make the string balanced by swapping index 0 with index 3.
The resulting string is "[[]]".
Example 2:

Input: s = "]]][[["
Output: 2
Explanation: You can do the following to make the string balanced:
- Swap index 0 with index 4. s = "[]][][".
- Swap index 1 with index 5. s = "[[][]]".
The resulting string is "[[][]]".
Example 3:

Input: s = "[]"
Output: 0
Explanation: The string is already balanced.
 

Constraints:

n == s.length
2 <= n <= 106
n is even.
s[i] is either '[' or ']'.
The number of opening brackets '[' equals n / 2, and the number of closing brackets ']' equals n / 2.
 */

package strings;

public class minSwap {

    // solution 1
    public int minSwaps(String s) {
        int open = 0;
        int unbalanced = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '[') {
                open++;
            } else if (open > 0) {
                open--;
            } else {
                unbalanced++;
            }
        }
        return (unbalanced + 1) / 2;
    }

    // solution 2 is the most optimal solution
    public int minSwaps(String s) {
        int opening = 0;
        int unbalanced = 0;

        for (var c : s.getBytes()) {
            if (c == '[') {
                opening++;
            } else {
                if (opening > 0)
                    opening--;
                else
                    unbalanced++;
            }
        }
        return (unbalanced + 1) / 2;
    }


    // solution 3

    public int minSwaps(String s) {
        int open = 0;
        int unbalanced = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '[') {
                open++;
            } else if (open > 0) {
                open--;
            } else {
                unbalanced++;
            }
        }
        return (unbalanced + 1) / 2;
    }

    public static void main(String[] args) {

    }
}
