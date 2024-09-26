
/*
 * 8. Pascal's Triangle
Solved
Easy
Topics
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
 */

package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Handle edge cases
        if (numRows <= 0) return triangle; // Return an empty triangle for non-positive numRows

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // The first and last values in each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Each triangle element (except the edges) is the sum of the two elements above it
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
    public static void main(String[] args) {
        
    }
    
}
