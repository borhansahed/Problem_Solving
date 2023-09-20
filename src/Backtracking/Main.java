package Backtracking;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        backtracking(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void backtracking(int[] arr, int i){

        if(i == arr.length) return;

        arr[i] = i+1;

        backtracking(arr,  i+1);
        arr[i] = arr[i] - 2;
    }


}
