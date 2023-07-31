package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int target = 8;
        System.out.println(fourSum(arr,target));
    }

   static List<List<Integer>> fourSum (int[] nums, int target){

        // T.C O(n^3) S.C -> O(1)
       List<List<Integer>> result = new ArrayList<>();

       Arrays.sort(nums);
       for(int i = 0; i<nums.length - 3; i++){

           if(i>0 && nums[i] == nums[i-1]) continue;

           for(int j = i+1; j<nums.length-2; j++){

               if( j > i+1 && nums[j] == nums[j-1])continue;

               int left = j+1;
               int right = nums.length - 1;

               while(left < right){

                   long sum = nums[i] + nums[j] + nums[left] + nums[right];

                   if(sum == target){
                       result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                       left++;
                       right--;
                       while( left<right && nums[left] == nums[left + 1]) left++;
                       while(left<right && nums[right] == nums[right - 1]) right--;
                   }else if (sum > target){
                       right--;
                   }else{
                       left++;
                   }
               }
           }
       }

       return result;
        /*



        for(int i = 0; i<nums.length; i++){

            for(int j = i+1; j<nums.length; j++){

                for(int k = j+1; k< nums.length; k++){

                    for(int m = k+1; m<nums.length; m++){

                        int sum = nums[i] + nums[j] + nums[k] + nums[m];
                        if(sum == target){
                          result.add(Arrays.asList(nums[i], nums[j] , nums[k] , nums[m]));
                        }
                    }
                }
            }
        }

         */








    }
}
