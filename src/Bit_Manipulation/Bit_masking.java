package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class Bit_masking {

    public static void main(String[] args) {
       int[] arr = {2,3,5};

        List<List<Integer>> ans = all_subset(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> all_subset (int[] arr) {

        int subset_length = 1<<arr.length;

        List<List<Integer>> ans = new ArrayList<>();
         for(int mask = 0; mask<subset_length; mask++){
             List<Integer> list = new ArrayList<>();
            for(int j = 0; j<arr.length; j++){
                if((mask & (1<<j)) != 0){
                   list.add(arr[j]);
                }
            }

            ans.add(list);
        }
        return ans;
    }
}
