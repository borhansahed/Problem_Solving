package Array.Medium;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {

   // kadane's algo for find maxSubArray sum  T.C -> O(N) S.C -> O(1)

        int sum = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            sum +=nums[i];
            if(sum < 0){
                sum = 0;
            }

           max = Math.max(max, sum);
        }
        return max;

       /*
       T.C -> O(n)
       S.C -> O(n)
        HashSet<Integer> hash = new HashSet<>();

        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum +=nums[i];
            if(sum < 0){
                sum = 0;
            }

            hash.add(sum);
        }
        return Collections.max(hash);
        */

       /*
       T.C -> O(n^2)
       S.C -> O(1)

       int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {

                sum += nums[j];
                ans = Math.max(ans, sum);
            }

        }

        return ans; */
    }
}
