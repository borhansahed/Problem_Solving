package Array.Hard;

import java.util.HashMap;

public class SubArray_Xor {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4,6};
        System.out.println(subArrayWithXor(arr, 6));
    }

    static int subArrayWithXor(int[] arr, int k) {

        // T.C -> O(n) S.C -> O(n)
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int j : arr) {
            xor ^= j;
            int remain = xor ^ k;
            if (map.containsKey(remain)) {
                count += map.get(remain);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;

        /*

        T.C -> O(n^2) S.C -> O(1)
         int count = 0;

        for (int i = 0; i <arr.length; i++){

            int xor = 0;
            for(int j = i; j<arr.length; j++){

                xor ^= arr[j];
                if(xor == k){
                    count++;
                }
            }
        }


            return count;
         */

    }
}
