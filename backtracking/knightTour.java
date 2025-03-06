/*
 * 2596. Check Knight Tour Configuration
Solved
Medium
Topics
Companies
Hint
There is a knight on an n x n chessboard. In a valid configuration, the knight starts at the top-left cell of the board and visits every cell on the board exactly once.

You are given an n x n integer matrix grid consisting of distinct integers from the range [0, n * n - 1] where grid[row][col] indicates that the cell (row, col) is the grid[row][col]th cell that the knight visited. The moves are 0-indexed.

Return true if grid represents a valid configuration of the knight's movements or false otherwise.

Note that a valid knight move consists of moving two squares vertically and one square horizontally, or two squares horizontally and one square vertically. The figure below illustrates all the possible eight moves of a knight from some cell.


 

Example 1:


Input: grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
Output: true
Explanation: The above diagram represents the grid. It can be shown that it is a valid configuration.
Example 2:


Input: grid = [[0,3,6],[5,8,1],[2,7,4]]
Output: false
Explanation: The above diagram represents the grid. The 8th move of the knight is not valid considering its position after the 7th move.
 

Constraints:

n == grid.length == grid[i].length
3 <= n <= 7
0 <= grid[row][col] < n * n
All integers in grid are unique.
 */

package backtracking;

public class knightTour {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        int expectedVal=n*n-1;
        boolean result= solution(grid,n,0,0,0);
        return result;
    }

    private boolean solution(int[][] grid,int n,int row,int col,int expectedVal){
        if(row<0 || col<0 || row>=n || col>=n || grid[row][col]!=expectedVal){
            return false;
        }

        if(expectedVal==n*n-1){
            return true;
        }
        boolean ans1=solution(grid,n,row-2,col+1,expectedVal+1);
        boolean ans2=solution(grid,n,row-1,col+2,expectedVal+1);
        boolean ans3=solution(grid,n,row+1,col+2,expectedVal+1);
        boolean ans4=solution(grid,n,row+2,col+1,expectedVal+1);
        boolean ans5=solution(grid,n,row+2,col-1,expectedVal+1);
        boolean ans6=solution(grid,n,row+1,col-2,expectedVal+1);
        boolean ans7=solution(grid,n,row-1,col-2,expectedVal+1);
        boolean ans8=solution(grid,n,row-2,col-1,expectedVal+1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
    
    public static void main(String[] args) {
        
    }
}
