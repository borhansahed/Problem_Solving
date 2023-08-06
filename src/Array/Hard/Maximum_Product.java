package Array.Hard;

import java.util.Arrays;

public class Maximum_Product {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4,10};

        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {



        int pre = 1;
        int sup = 1;
        int ans = nums[0];
        for (int j = 0; j < nums.length; j++) {

            if(pre == 0) pre = 1;
            if(sup == 0) sup = 1;

            pre *= nums[j];
            sup *= nums[nums.length - j-1];
            ans = Math.max(ans, Math.max(pre,sup));

        }




        return ans;

        /*
        T.C -> O(n^2)
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            long tempMax = 1;

            for (int j = i; j < nums.length; j++) {
                tempMax *= nums[j];
                max = Math.max(max, (int)tempMax);
            }


        }

        return max;

         */

    }
}