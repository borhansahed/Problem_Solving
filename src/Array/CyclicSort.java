package Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      int[] arr = {1,0,3};
      cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort (int[] arr){

        int i = 0;

        while(i<arr.length){

            int correctIndex = arr[i] - 1;

            if(arr[correctIndex] !=  arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }

    private static void reverse(int nums[], int start, int end){

        for(int i = start; i<end / 2; i++){

            int temp = nums[i];
            nums[i] = nums[end-i-1];
            nums[end-i-1] = temp;
        }
    }

}
