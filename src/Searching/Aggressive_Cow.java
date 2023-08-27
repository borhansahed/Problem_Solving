package Searching;


import java.util.Arrays;

public class Aggressive_Cow {

    public static void main(String[] args) {
       int[] aggressiveCows = {0 ,3, 4 ,7 ,10, 9};
        System.out.println(aggressiveCows(aggressiveCows, 4));
    }


    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int start = 0;
        int end = 0;

        for(int stall : stalls){
            start = Math.min(stall, start);
            end = Math.max(stall, end);
        }
        int ans = 0;
        while(start <= end){

            int mid = start + (end - start) /2;

            if(isPossible(stalls,mid,k)){
                ans = mid;
                start = mid + 1;
            }else{
                 end  = mid - 1;
            }

        }
        return ans;
    }

    private static boolean isPossible(int[] stalls, int mid, int cow) {

        int cowCount = 1;
        int curStall = stalls[0];

        for(int i = 1; i<stalls.length; i++){

            if((stalls[i] - curStall) >= mid) {
                cowCount++;
                curStall = stalls[i];

            }
            if(cowCount == cow) return true;
        }

        return false;
    }
}
