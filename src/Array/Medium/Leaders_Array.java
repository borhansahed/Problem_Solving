package Array.Medium;

import java.util.Arrays;

public class Leaders_Array {
    public static void main(String[] args) {

        int[] arr = {4,2,2,3,3};
        System.out.println(Arrays.toString(leaders_array(arr)));
    }

    static int[] leaders_array(int[] arr) {
        // I have to solve it in T.C -> O(n) S.C -> O(n)


        int[] result;

        if(arr.length % 2 == 1){
            result = new int[arr.length / 2 + 1];
        }else{
            result = new int[arr.length / 2];
        }
        int k = result.length - 1;

        int maxEle = -1;
        int right = arr.length - 1;
        for (int i = right; i >= 0; i--) {

            if (arr[i] >= maxEle) {
                result[k--] = arr[i];
            }

            maxEle = Math.max(maxEle, arr[i]);

        }
        return result;



        /*

        T.C -> O(n^2)
        S.C -> O(logN)
        int[] result = new int[arr.length/2];
        int k = 0;
        for (int i = 0; i < arr.length;) {
            int maxEle = 0;
            int index = 0;

            for (int j = i ; j < arr.length; j++) {

                if (maxEle <= arr[j]) {
                    maxEle = arr[j];
                    index = j;
                }
            }

            i = index + 1;
            result[k++] = maxEle;

        }

        return result;
         */


    }
}
