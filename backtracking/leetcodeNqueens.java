/*
 * 51. N-Queens
Solved
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9
 */

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetcodeNqueens {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(result, board, 0, n);
        return result;
    }

    private void nQueens(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {  // Corrected function call
                board[row][i] = 'Q';
                nQueens(result, board, row + 1, n); // Corrected method call
                board[row][i] = '.'; // Backtrack
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') { // Corrected comparison
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) { // Fixed loop condition
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) { // Fixed loop condition
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // Safe position
    }

    private List<String> construct(char[][] board) {
        List<String> boardString = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            boardString.add(new String(board[i]));
        }
        return boardString;
    }
    
    public static void main(String[] args) {
        
    }
}
