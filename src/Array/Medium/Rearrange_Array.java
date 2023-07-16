package Array.Medium;

import java.util.Arrays;
import java.util.Collections;



public class Rearrange_Array {
    public static void main(String[] args) {
        /*
        Here, Question is i have one array. The array length will be even number consisting of an equal number of positive and negative integers.
        {3,1,-1,2,-3,-4} every pair should maintain positive and negative number. The ans is {3,-1, 1,-3, -4}
        here, one tricks i applied that is every negative numbers are took odd index
         */

        int[] arr = {3, 1, -1, 2, -3, -4};
        System.out.println(Arrays.toString(rearrange_array(arr)));
    }

    static int[] rearrange_array(int[] nums) {

     // T.C O(n)  S.C -> O(n)
        int j = 0;
        int k = 1;

        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){

            if(nums[i] < 0){
                ans[k] = nums[i];
                k +=2;
            }else{
                ans[j] = nums[i];
                j+=2;
            }
        }

        return ans;


        /*
         T.C -> O(n^2)

          for (int i = 0; i < nums.length; i++) {

            boolean flag = nums[i] > 0;

            for (int j = i + 1; j < nums.length; j++) {

                if (flag && nums[j] < 0) {
                    int temp = nums[i+1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                    break;
                }

                if (!flag && nums[j] > 0) {
                    if(nums[0] < 0){
                        int temp = nums[0];
                        nums[0] = nums[j];
                        nums[j] = temp;
                        break;
                    }else{
                        int temp = nums[i+1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }


                }


            }

         */
        }

        static  void swap (int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


}
