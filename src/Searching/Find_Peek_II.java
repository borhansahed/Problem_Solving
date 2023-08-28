package Searching;

import java.util.Arrays;

public class Find_Peek_II {
    public static void main(String[] args) {
        int[][] arr = {
                {41, 8, 2, 48, 18},
                {16, 15, 9, 7, 44},
                {48, 35, 6, 38, 28},
                {3, 2, 14, 15, 33},
                {39, 36, 13, 46, 42}

        };
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    public static int[] findPeakGrid(int[][] mat) {

        int row = mat.length - 1 ;
        int col = mat[0].length - 1;

        while (row >= 0 && col >= 0 ) {

            int[] peekEle = isPeek(mat, row, col);
            if (peekEle[0] == row && peekEle[1] == col) {
                return new int[]{row, col};
            } else {
                row = peekEle[0];
                col = peekEle[1];
            }

        }
        return new int[]{-1, -1};
    }

    private static int[] isPeek(int[][] mat, int row, int col) {

        int ele = mat[row][col];


        // top
        if (row > 0 && mat[row - 1][col] > ele) return new int[]{row - 1, col};
        // right
        if (col < mat[0].length - 1 && mat[row][col + 1] > ele) return new int[]{row, col + 1};
        // left
        if (col > 0 && mat[row][col - 1] > ele) return new int[]{row, col - 1};
        // bottom
        if (row < mat.length - 1 && mat[row + 1][col] > ele) return new int[]{row + 1, col};

        return new int[]{row, col};
    }
}
