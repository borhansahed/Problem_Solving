package Array.Medium;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 2, 3, 3, 1, 3,3,3,3};
        // element count will be greater than arr.length / 2 nor - 1;
        System.out.println(majority_ele(arr));
    }

    static int majority_ele(int[] nums) {

        // moor's voting algorithm
        // T.C ->  O(n) S.C -> O(n)

        int ele = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == ele) {
                count++;
            } else if (count == 0) {
                count = 1;
                ele = nums[i];
            } else {
                count--;
            }
        }

        count = 0;

        for(int i : nums){
            if(i == ele) count++;
        }

        if (count > nums.length / 2) return ele;
        return -1;



        /*

        T.C -> O(n^2)
        S.C -> O(1)
        int ans = 0;
        int outCount = 0;

        for(int i = 0; i<nums.length; i++){
            int count = 1;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(outCount < count){
                outCount = count;
                ans = nums[i];
            }
        }


        return ans; */
    }
}
