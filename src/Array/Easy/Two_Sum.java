package Array.Easy;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,2,1};

        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        while(s < nums.length && e >=0){
            int sum = nums[s] + nums[e];
            if( sum == target){
                return new int[]{s,e};
            }else if( sum > target){
                e--;
            }else{
                s++;
            }
        }
        return new int[]{-1,-1};
    }
}
