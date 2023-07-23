package Array.Medium;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
       int[][] arr = {
               {1,2,3,10},
               {4,5,6,11},
               {7,8,9,12},
               {13,14,15,16}
       };
        rotate_image(arr);
        for (int[] num: arr
             ) {
            System.out.println(Arrays.toString(num));
        }
    }

    static void rotate_image (int[][] matrix ) {

      // T.C O(n^2) S.C O(1)
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i<row; i++){

            for(int j = i+1; j<col; j++){
               swap(matrix,i,j);
            }
        }

//        for (int[] ints : matrix) {
//            reverse(ints);
//        }

   /*
   T.C O(n^2)
   S.C O(n^2)

   int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[row][col];


        int colIndex = 0;
        while(colIndex < col){

            for (int i = 0; i<col ; i++) {
                result[i][colIndex] = matrix[row-1][i];
            }
            colIndex++;

            row--;
        }
        return result;

    */

    }

    private static void reverse(int[] matrix) {
        int start = 0;
        int end = matrix.length - 1;
        while (start<end){
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }

    static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
