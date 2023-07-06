package Array;

import java.util.Arrays;

public class Reverse_Array_K_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
       int  k = 3;
        k =  k % arr.length;

        reverse(arr,0,arr.length - k);
        reverse(arr,0, arr.length);
        reverse(arr, 0, k);

        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int nums[], int start, int end){

        for(int i = start; i<end / 2; i++){

            int temp = nums[i];
            nums[i] = nums[end-i-1];
            nums[end-i-1] = temp;
        }
    }
}
