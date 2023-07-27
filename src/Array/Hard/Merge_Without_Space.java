package Array.Hard;


import java.util.Arrays;

public class Merge_Without_Space {
    public static void main(String[] args) {
        long[] arr1 = {1, 10, 11};
        long[] arr2 = {9, 2, 3,4};
        mergeWithoutSpace(arr1, arr2, 3, 4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void mergeWithoutSpace(long arr1[], long arr2[], int n, int m) {

        // T.C (log(n+m) * (n + m))  // S.C -> O(1)
        int len = (n + m);
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                // left in arr1 and right in arr2
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // right in arr2 and left in arr2
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);

                    // right and left in arr1
                } else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;

            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }

    }

    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
}
