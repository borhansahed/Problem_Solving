package Array.Medium;

import java.util.HashSet;
import java.util.Objects;

public class Valid_Sudoku {
    public static void main(String[] args) {

        String[][] board = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "s"},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        System.out.println(valid_sudoku(board));
    }

    static boolean valid_sudoku(String[][] board) {

        // T.C  -> O(81)  S.C -> O(n)
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != ".") {
                    String row = "row" + i + board[i][j];
                    String col = "col" + j + board[i][j];
                    String box = "box" + (i / 3) * 3 + (j / 3) + board[i][j];

                    if (!set.contains(row) && !set.contains(col) && !set.contains(box)) {
                        set.add(row);
                        set.add(col);
                        set.add(box);
                    } else {
                        return false;
                    }


                }
            }
        }
        return true;
    }


}
