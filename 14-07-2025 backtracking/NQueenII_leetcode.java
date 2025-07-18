# leetcode 52. N-Queens II
class Solution {
    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            count++;
            printBoard(board); // Optional: prints the board
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // place queen
                nQueens(board, row + 1); // recur for next row
                board[row][col] = 'x'; // backtrack
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-----------Chessboard----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int totalNQueens(int n) {
        count = 0; // reset count
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int solutions = totalNQueens(n);
        System.out.println("Total number of ways: " + solutions);
    }
}
