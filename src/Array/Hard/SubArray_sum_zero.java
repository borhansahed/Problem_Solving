package Array.Hard;

import java.util.HashMap;

public class SubArray_sum_zero {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr, arr.length));
    }


  static   int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLen = 0;
        int sum = 0;

       for(int i = 0; i<n; i++){

           sum+=arr[i];

           if(sum == 0){
               maxLen = i+1;
           }else{

               if(map.containsKey(sum)){
                   maxLen = Math.max(maxLen, i -  map.get(sum));
               }else{
                   map.put(sum, i);
               }
           }

       }

        return maxLen;
    }
}
