#leetcode 51. N-Queens
class Solution {
    public static void queen(char[][] board, int row, List<List<String>>ans){
        if(row==board.length){
            ans.add(makeString(board));
            return;
        }
        for(int col = 0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q'; //add
                queen(board,row+1,ans);
                board[row][col] = '.'; //remove
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board,0,ans);
        return ans;    
    }
    static List<String>makeString(char[][] board){
        List<String>L = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            String row = new String(board[i]);
            L.add(row);
        }
        return L;
    }
public static boolean isSafe(char[][] board, int row, int col) {
        // Check column (vertical up)
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // Safe to place queen
    }
}  
