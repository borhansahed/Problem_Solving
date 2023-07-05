package Array;

import java.util.Arrays;

public class Marge_Two_Array {
    /* Marge to sorted ascending array with the Time Complexity O(n) and Space Complexity O(1);
      I have to modify only Nums1[];

     */

    public static void main(String[] args) {
        // 0 means no value
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,3,4,5};
        merge(nums1,3,nums2,4);
        System.out.println(Arrays.toString(nums1));

        for (int i: nums1) {
            System.out.println(i);
        }

        /*
        Here, I had to modify nums1 Array.
        if m = 0, I had to store in nums1[j].
        if n = 0, I didn't need to store anything in nums1.
        that's why I took j>=0 as a while loop condition.

        T.C -> O(n)
        S.C -> O(1)
         */
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int i = m - 1;
        int j = n - 1;
        int k = (m + n) -1;

        while(j>=0){

            if( i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

    }

}
