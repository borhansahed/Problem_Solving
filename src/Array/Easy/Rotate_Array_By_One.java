package Array.Easy;

import java.util.Arrays;

public class Rotate_Array_By_One {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int arr[], int n) {

        int lastEle = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastEle;
    }
}
