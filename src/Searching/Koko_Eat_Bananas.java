package Searching;

public class Koko_Eat_Bananas {
    public static void main(String[] args) {
     int[] nums = {30,11,23,4,20};
        System.out.println(findMinimum(nums, 5));
    }

    static int findMinimum (int[] piles, int h){

        int start = 0;
        int end = maxPiles(piles);

        while (start <=end){

            int mid = start + (end - start) /2;

            int time = eatingTime(piles, mid);
            if(time <= h) end = mid - 1;
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int eatingTime(int[] piles, int mid) {

        int totalTime = 0;

        for(int i = 0; i<piles.length; i++){
            totalTime += Math.ceil(((double) piles[i] / mid));
        }
        return totalTime;
    }

    private static int maxPiles(int[] piles) {
        int max = Integer.MIN_VALUE;

        for(int num : piles){
            max = Math.max(max, num);
        }

        return max;
    }
}
