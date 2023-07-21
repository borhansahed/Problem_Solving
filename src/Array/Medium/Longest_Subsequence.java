package Array.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Subsequence {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 4};
        System.out.println(longest_subsequence(arr));
    }

    static int longest_subsequence(int[] arr) {

        // optimal Solution
        // T.C -> O(n) S.C -> O(n)

        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for (int i : arr) {
            set.add(i);
        }

        for (int i : set) {

            if (!set.contains(i - 1)) {
                int x = i;
                int count = 1;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }

                longest = Math.max(longest, count);

            }
        }


        return longest;


     /*
     T.C -> O(n*logN)
     S.C -> O(1)

       Arrays.sort(arr);

        int ele = arr[0];
        int count = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {

            if ((ele + 1) == arr[i] && ele != 0 || arr[i-1] == arr[i]) {
                count++;
                ele = arr[i];
                max = Math.max(max, count);
            } else {
                ele = arr[i];
                count = 1;
            }
        }

        return max;

      */

    }
}
