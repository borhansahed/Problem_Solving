package Array.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Element_Two {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {


        /*
        T.C -> O(n) S.C -> O(n)
         List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {


            map.put(num, map.getOrDefault(num, 0) + 1);


        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > (nums.length / 3)) {
                ans.add(set.getKey());
            }
        }

        return ans;

         */

        //  T.C -> O(n) S.C -> O(1)
        List<Integer> ans = new ArrayList<>();

        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                count2++;
            } else if (nums[i] == ele1) count1++;
            else if (nums[i] == ele2) count2++;
            else {
                count2--;
                count1--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int a : nums) {
            if (ele1 == a) count1++;
            if (ele2 == a) count2++;
        }

        if (count1 > nums.length / 3) ans.add(ele1);
        if (count2 > nums.length / 3) ans.add(ele2);

        return ans;
    }
}
