package Array.Medium;

import java.util.Arrays;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };


        System.out.println(Arrays.toString(spiral_matrix(matrix)));
    }


    static int[] spiral_matrix(int[][] matrix) {


        /*
        T.C -> O(m*n);
        S.C -> O(n);
         */
        int row = matrix.length;
        int col = matrix[0].length;

        int[] result = new int[row * col];

        int total = row * col;
        int count = 0;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;
        while (count < total) {

            for (int i = startingCol; count < total && i <= endingCol; i++) {
                result[count++] = matrix[startingRow][i];
            }
            startingRow++;

            for (int i = startingRow; count < total && i <= endingRow; i++) {
                result[count++] = matrix[i][endingCol];
            }
            endingCol--;

            for (int i = endingCol; count < total && i >=startingCol; i--) {
                result[count++] = matrix[endingRow][i];
            }
            endingRow--;

            for (int i = endingRow; count < total && i >= startingRow; i--) {
                result[count++] = matrix[i][startingCol];
            }
            startingCol++;
        }


        return result;

    }
}
