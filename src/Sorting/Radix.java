package Sorting;

import java.util.Arrays;
import java.util.OptionalInt;

public class Radix {
    public static void main(String[] args) {

        int[] arr = {431,342,1,54,3,5,73};
        int n = arr.length;



        radixSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort (int[] arr, int n ){

        int max = Arrays.stream(arr).max().getAsInt();


        // now run the loop based on max value digits

        for(int pos = 1; (max / pos) > 0; pos *= 10){

            countSort(arr, pos);
        }
    }

    private static void countSort(int[] arr, int pos) {

        int[] count = new int[10];
        int[] output= new int[arr.length];

        for(int n : arr){
            count[(n / pos) % 10]++;
        }

        for(int i = 1; i<count.length; i++){
            count[i] += count[i-1];
        }


        for(int i = arr.length-1; i>=0; i--){

            output[--count[(arr[i] / pos) % 10 ]] = arr[i];
        }

        System.arraycopy(output, 0, arr, 0, output.length);
    }
}
