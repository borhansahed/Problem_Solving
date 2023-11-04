package Sorting;

import java.util.Arrays;


public class Count_Sort {
    public static void main(String[] args) {

        int[] arr = {6,2,7,5,3,1,0,10,4};
        System.out.println(Arrays.toString(countSort(arr)));

    }

    private static int[] countSort(int[] arr){

        if(arr.length == 1 || arr.length == 0){
            return null;
        }

        int max = arr[0];

        for(int n : arr){
            if(n > max){
                max = n;
            }
        }

        // create new frequency array. Where every element count will be store
        int[] countArray = new int[max+1];

        for(int n : arr){
            countArray[n]++;
        }

        int index = 0;

        for(int i = 0;  i<arr.length; i++){

            if(countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }

        return arr;
    }
}
