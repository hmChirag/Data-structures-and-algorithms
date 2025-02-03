/*
 * 36. Valid Sudoku
Solved
Medium
Topics
Companies
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 
 */




public class validSudoku {
    
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!isValid(i,j,board)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row,int col,char[][] board){
        if(board[row][col]=='.') return true;

        for(int i=0;i<9;i++){
            if(col!=i && board[row][i]==board[row][col]) return false;
            if(row!=i && board[i][col]==board[row][col]) return false;
            if((3*(row/3)+i/3) !=row && (3*(col/3)+i%3) !=col && board[(3*(row/3)+i/3)][(3*(col/3)+i%3)]==board[row][col]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
