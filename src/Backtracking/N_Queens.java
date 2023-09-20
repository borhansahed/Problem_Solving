package Backtracking;

public class N_Queens {
    static int count = 0;
    public static void main(String[] args) {

        char[][] board = new char[4][4];

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);

    }

    private static void nQueens(char[][] board, int row) {


        // base case

        if (row == board.length) {
            count++;
            displayBoard(board);
            System.out.println();
            return;
        }

        if(count == 1)return;
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = '.';
            }

        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {


        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // horizontal

        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Top Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }  // Top  Diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        // bottom Diagonal left
        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }  // Bottom  Diagonal right
        for (int i = row + 1, j = col + 1; i < board.length && j < board[0].length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void displayBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }

            System.out.println();
        }
    }
}
