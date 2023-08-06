package Searching;



public class Search_Rotate_array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(search(arr,1));
    }

    private static int search (int[] nums, int target){
        int pivot = pivot(nums);
        if(target == nums[pivot]) return pivot;

        int start = 0;
        int end = nums.length - 1;
        if(target >= nums[start])end = pivot -1 ;
        else{
            start = pivot+1;
        }

        while (start<= end){
            int mid = start + (end - start) /2 ;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int pivot(int[] arr) {
        
        

        
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] >= arr[0])start = mid + 1;
            else{
                end = mid;
            }
        }
        return start-1;
    }

}
