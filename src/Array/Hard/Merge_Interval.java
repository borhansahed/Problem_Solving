package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Interval {
    public static void main(String[] args) {
        int[] arr[] = {

                {2,6},
                {8,10},
                {15,18},
                {1,3},
        };
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int[][] ans = mergeInterval(arr);
        for(int[] a : ans){

            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] mergeInterval(int[][] intervals){


        ArrayList<int[]> result = new ArrayList<>();


         for(int i = 0; i<intervals.length; i++){
             if(result.isEmpty() || result.get(result.size() - 1)[1] < intervals[i][0]){
                 result.add(intervals[i]);
             }else{
                 result.get(result.size() - 1)[1] = Math.max(  result.get(result.size() - 1)[1], intervals[i][1]);
             }
         }

         return result.toArray(new int[result.size()][]);
    }
}
