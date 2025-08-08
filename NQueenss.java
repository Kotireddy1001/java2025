//N-Queens (Backtracking)

import java.util.Arrays;

public class NQueenss {
    public static void solve(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(0, board);
    }

    static void backtrack(int row, char[][] board) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board);
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q' || 
               (col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q') ||
               (col + (row - i) < board.length && board[i][col + (row - i)] == 'Q'))
                return false;
        return true;
    }

    static void printBoard(char[][] board) {
        for (char[] row : board)
            System.out.println(new String(row));
        System.out.println();
    }

    public static void main(String[] args) {
        solve(4);
    }
}
