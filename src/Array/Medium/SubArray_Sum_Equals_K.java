package Array.Medium;

import java.util.HashMap;

public class SubArray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2,2};
        System.out.println(subArray(arr, 4));
    }

    static int subArray(int[] nums, int k) {

        // T.C O(n^2)
//        int ans = 0;
//        for(int i = 0; i<nums.length; i++){
//              int sum = 0;
//
//            for(int j = i; j<nums.length; j++){
//                sum+=nums[j];
//                if(sum == k) ans++;
//                System.out.print(nums[j] + " --> ");
//            }
//
//            System.out.println();
//        }
//       return ans;


        /*
        T.C O(N) using Hashmap
        S.C O(N)
        */

        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }


            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
