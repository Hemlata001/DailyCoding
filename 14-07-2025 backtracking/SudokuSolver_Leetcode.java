# leetcode 37. Sudoku Solver
class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number){
        // Check row & column
        for(int i = 0; i < 9; i++){
            if(board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')){
                return false;
            }
        }

        // Check 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        // Base Case
        if(row == 9) return true;

        int nRow = (col != 8) ? row : row + 1;
        int nCol = (col != 8) ? col + 1 : 0;

        if(board[row][col] != '.'){
            return helper(board, nRow, nCol);
        }

        for(int i = 1; i <= 9; i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = (char)(i + '0');
                if(helper(board, nRow, nCol)){
                    return true;
                }
                board[row][col] = '.'; // Backtrack
            }
        }

        return false; // No valid number found
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
