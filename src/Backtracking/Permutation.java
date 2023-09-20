package Backtracking;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<List<Integer>> list = permute(new int[]{1,2,3});
        System.out.println(list);

    }

        public static List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> ans = new ArrayList<>();
            solve(nums,ans,0);
            return ans;
        }

        private static void solve(int[] nums, List<List<Integer>> ans, int i){

            // base case

            if(i >= nums.length){
               List<Integer> temp = Arrays.stream(nums).boxed().toList();
                ans.add( new ArrayList<>(temp));
                return;
            }

            for(int j = i; j<nums.length; j++){

                swap(nums, i, j);
                solve(nums,ans, i+1);
                 swap(nums,i,j);
            }
        }

        private  static  void swap (int[] nums, int i, int j){

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}
