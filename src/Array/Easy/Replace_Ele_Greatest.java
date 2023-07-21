package Array.Easy;

import java.util.Arrays;

public class Replace_Ele_Greatest {
    public static void main(String[] args) {
        int[] arr = {17,18,5,3,4,6,2};
        System.out.println(Arrays.toString(replace_ele_greatest(arr)));
    }

    static int[] replace_ele_greatest(int[] nums) {

        // T.C -> O(n)  S.C -> O(1)
        int[] result = new int[nums.length];
        int k = result.length - 1;

        int max = -1;
        for (int i = nums.length - 1; i >= 0; i--) {


            if (nums[i] >= max) {
                 int temp = max;
                max = nums[i];
                nums[i] = temp;

            }else{
                nums[i] = max;
            }
        }

        return nums;

    }


}
