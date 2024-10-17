/*
 * 
 * 670. Maximum Swap
Solved
Medium
Topics
Companies
You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.

 

Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.
 

Constraints:

0 <= num <= 108
 */


package arrays;

public class maxSwap {
    public int maximumSwap(int num) {
        // Convert the number to a character array (string representation)
        char[] digits = Integer.toString(num).toCharArray();
        int maxNum = num;

        // Iterate through all pairs of digits to perform the swap
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                // Swap the digits
                swap(digits, i, j);
                
                // Convert back to integer and compare
                int swappedNum = Integer.parseInt(new String(digits));
                maxNum = Math.max(maxNum, swappedNum);
                
                // Swap back to restore original order
                swap(digits, i, j);
            }
        }
        return maxNum;
    }

    // Helper method to swap two characters in a char array
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        
    }
}
