package Array.Medium;

import java.util.Arrays;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0}
        };

        set_matrix_zero(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    static void set_matrix_zero(int[][] matrix) {

        // T.C -> O(n^2)

        boolean isRow = false;
        boolean isCol = false;

        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                isRow = true;
            }
        }


        for(int i = 0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                isCol = true;
            }
        }
        System.out.println(isCol + " " + isRow);

        for (int i = 1; i < matrix.length; i++) {

            for(int j = 1; j<matrix[0].length; j++){

                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

       for(int i = matrix.length - 1; i>0; i--){

           for(int j = matrix[0].length - 1; j>0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
           }
       }

       if(isRow){
           for (int i = 0; i < matrix.length; i++) {
               matrix[i][0] = 0;
           }
       }
        if(isCol){
            for (int i = 0; i < matrix.length; i++) {
                matrix[0][i] = 0;
            }
        }
       /*
        Brute force -  T.C ->( O(n^2) + O(n+m) ) + O(n^2) = O(n^3) very bad T.C
        int row = matrix.length;

         T.C -> O(n^2)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {

                  T.C -> O(n)
                   traverseRow(matrix, i, j);
                    T.C -> O(m)
                   traverseCol(matrix,j, i);

                }

            }

        }

         T.C -> O(n^2)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {

                    matrix[i][j] = 0;

                }

            }

        }

        */
    }

    private static void traverseCol(int[][] nums, int j, int i ) {

        for( int k = 0; k<nums[i].length; k++){

            if (nums[i][k] != 0) {
                nums[i][k] = -1;

            }
        }
    }

    private static void traverseRow(int[][] nums, int i, int j) {

        for( int k = i; k<nums.length; k++){

            if (nums[k][j] != 0) {
                nums[k][j] = -1;

            }
        }

    }
}

