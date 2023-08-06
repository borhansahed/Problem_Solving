package Searching;

import java.util.Arrays;

public class Floor_Ceil {
    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 7, 8, 10};
        int[] ans = new int[2];
        ans[0] = floorCeil(arr,8,true);
        ans[1] = floorCeil(arr, 8, false);
        System.out.println(Arrays.toString(ans));

    }

    static int floorCeil(int[] arr, int target, boolean floor) {


        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                if (floor) {
                    ans = mid - 1;
                    end = mid - 1;

                } else {
                    ans = mid + 1;
                    start = mid + 1;

                }
            }
        }

        return ans;
    }
}
