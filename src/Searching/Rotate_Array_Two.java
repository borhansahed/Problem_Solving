package Searching;

public class Rotate_Array_Two {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 3;
        boolean ans = searchRotateTwo(nums,   target);
        System.out.println(ans);
    }
    static boolean searchRotateTwo(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target ||
                    nums[start] == target ||
                    nums[end] == target) return true;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }

            if(nums[start] <= nums[mid]){

                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else{
                if(target < nums[end] && target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return false;

    }
}
