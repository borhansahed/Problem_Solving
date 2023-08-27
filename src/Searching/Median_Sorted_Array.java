package Searching;

public class Median_Sorted_Array {

    public static void main(String[] args) {

        int[] arr = {1, 3};
        int[] arr1 = {2};
        System.out.println(findMedianSortedArrays(arr, arr1));
        System.out.println("Sahed");

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        if (m > n) return findMedianSortedArrays(nums2, nums1);
        int start = 0;
        int end = m;

        while (start <= end) {

            int leftSide1 = (start + end) / 2;
            int leftSide2 = ((m + n + 1) / 2) - leftSide1;

            int max1 = (leftSide1 > 0) ? nums1[leftSide1 - 1] : Integer.MIN_VALUE;
            int min1 = (leftSide1 < m) ? nums1[leftSide1] : Integer.MAX_VALUE;

            int max2 = (leftSide2 > 0) ? nums2[leftSide2 - 1] : Integer.MIN_VALUE;
            int min2 = (leftSide2 < n) ? nums2[leftSide2] : Integer.MAX_VALUE;

            if (max1 <= min2 && max2 <= min1) {

                if ((m + n) % 2 == 0) {
                    return (double) (Math.min(min1, min2) + Math.max(max1, max2)) / 2;
                } else {
                    return (double) (Math.max(max1, max2));
                }
            } else if (max1 > min2) {
                end = leftSide1 - 1;
            } else {
                start = leftSide1 + 1;
            }

        }
        return -1.0;
    }
}
