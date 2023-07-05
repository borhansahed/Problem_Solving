package Array;

import java.util.HashSet;
import java.util.Set;

public class Union_Of_Array {

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
