package Array.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static class SecondElement {
        public static void main(String[] args) {
            int[] arr = {10, 10,12, 13,10, 11, 10,10,9};
            System.out.println(findSecondElement(arr));
        }

        static int findSecondElement(int[] arr) {
            int maxElement = findMaxElement(arr);
            System.out.println(maxElement);
            int secondElement = -1;
            for (int j : arr) {

                if (maxElement > j) {
                    if(secondElement < j){
                        secondElement = j;
                    }

                }
            }

            return secondElement;
        }

        private static int findMaxElement(int[] arr) {

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (max < arr[i]) {
                    max = arr[i];
                }


            }

            return max;
        }
    }

    public static class Union_Of_Array {

        public static void main(String[] args) {
            int[] nums1 = {1,2,3};
            int[] nums2 = {2,3,4,5};
            System.out.println(doUnion(nums1,nums1.length, nums2, nums2.length));
        }

        public static int doUnion(int a[], int n, int b[], int m)
        {
            // int[] arr = new int[m + n];
            // int i = 0, j = 0, k = 0;

            // while (i < n && j < m) {
            //     if (a[i] < b[j]) {
            //         arr[k++] = a[i++];
            //     } else if (a[i] > b[j]) {
            //         arr[k++] = b[j++];
            //     } else {
            //         arr[k++] = a[i++];
            //         j++;
            //     }
            // }

            // while (i < n) {
            //     arr[k++] = a[i++];
            // }

            // while (j < m) {
            //     arr[k++] = b[j++];
            // }

            // return k;

            Set<Integer> ans = new HashSet<>();


            for(int i : a){
                ans.add(i);
            }

            for(int j: b){
                ans.add(j);
            }

            return ans.size();
        }

        // this code is good. but you have to apply set or HashSet;
    }
}
