package Searching;

public class Split_Array {

    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));

    }

    public static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for(int num: nums){

            start = Math.max(start, num);
            end += num;
        }

        while (start <= end){

            int mid = start + (end - start) /2;
            int partition =  countPartion(nums, mid);
            if(partition > k){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return start;
    }

    private static int countPartion(int[] nums, int mid) {

        int curPartition = 1;
        int partionSum = 0;

        for (int num : nums) {

            if ((partionSum + num) <= mid) {
                partionSum += num;
            } else {
                curPartition++;
                partionSum = num;
            }
        }

        return curPartition;

    }
}
