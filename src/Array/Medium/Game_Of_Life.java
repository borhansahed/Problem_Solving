package Array.Medium;

import java.util.Arrays;

public class Game_Of_Life {
    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}
        };

        gameOfLife(board);

        for (int[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }

    }

    static void gameOfLife(int[][] board) {

        // T.C -> O(n * m) S.C -> O(1)
        // iterating on board
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                int count = neighborsCount(board, i, j);

                if (board[i][j] == 1) {
                    if (count > 3 || count < 2) {
                        board[i][j] = -1;
                    }
                    if (count == 2 || count == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (count == 3) {
                        board[i][j] = 3;
                    }
                }


            }
        }

        updateBoard(board, row, col);

    }

    private static void updateBoard(int[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (board[i][j] == 2 || board[i][j] == 3) {
                    board[i][j] = 1;
                }
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private static int neighborsCount(int[][] board, int i, int j) {

        int neighborsCount = 0;
        int row = board.length  - 1;
        int col = board[0].length - 1;

        // horizontal
        if ((j + 1) <= col) {
            if (board[i][j + 1] == 1 || board[i][j + 1] == -1 || board[i][j + 1] == 2) {
                neighborsCount++;
            }

        }
        if ((j - 1) >= 0) {
            if (board[i][j - 1] == 1 || board[i][j - 1] == -1 || board[i][j - 1] == 2) {
                neighborsCount++;
            }

        }

        // vertical
        if ((i + 1) <= row) {
            if (board[i + 1][j] == 1 || board[i + 1][j] == -1 || board[i + 1][j] == 2) {
                neighborsCount++;
            }
        }

        if ((i - 1) >= 0) {
            if (board[i - 1][j] == 1 || board[i - 1][j] == -1 || board[i - 1][j] == 2) {
                neighborsCount++;
            }
        }


        // diagonal


        if ((i - 1) >= 0 && (j - 1) >= 0) {
            if (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == -1 || board[i - 1][j - 1] == 2) {
                neighborsCount++;
            }
        }

        if ((i - 1) >= 0 && (j + 1) <= col) {
            if (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == -1 || board[i - 1][j + 1] == 2) {
                neighborsCount++;
            }
        }

        if ((i + 1) <= row && (j - 1) >= 0) {
            if (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == -1 || board[i + 1][j - 1] == 2) {
                neighborsCount++;
            }
        }

        if ((i + 1) <= row && (j + 1) <= col) {
            if (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == -1 || board[i + 1][j + 1] == 2) {
                neighborsCount++;
            }
        }


        return neighborsCount;

    }
}
