package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if ( sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }

            }
        }
        return ans.stream().distinct().toList();


        /*
        T.C -> O(n^3) S.C -> (uniqueTriplets)

         for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();


                int k = j + 1;
                while (k < nums.length) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (list.size() < 3) {
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                        }


                    }


                    k++;
                }

                if (!list.isEmpty()) {
                    Collections.sort(list);
                    if (!ans.contains(list)) {
                        ans.add(list);
                    }

                }


            }
        }
         */
    }
}
