package Array.Medium;

import java.util.Arrays;


public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        next_permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void next_permutation(int[] nums) {

        /*
        T.C -> O(n)
        S.C O(1)

        1. First i have to stop where the number less than i+1 like [2,3,5,4,1,1].
           here i have to stop at index 1 because index 1 is less than index+1

        2. Find the index i have to swap with nums[i]; here the number is 4.
           Because 4 is next greater than 3

        3. Rearrange the array with reverse here after swapping [2,4,5,3,1,1]
           now you have to reverse i+1 to nums.length -1;
         */

        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1])i--;


        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);

        }
        reverse(nums, i + 1);

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

    }
}
