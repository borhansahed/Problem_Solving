package Searching;

import java.util.ArrayList;

public class Painters_Partition {
    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();

     for(int i = 0 ; i<4; i++){
         arr.add(5);
     }

        System.out.println(findLargestMinDistance(arr,2));
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int start = 0;
        int end = 0;

        for(int num: boards){

            start = Math.max(start, num);
            end += num;
        }

        while (start <= end){

            int mid = start + (end - start) /2;
            int partition =  findDays(boards, mid);
            if(partition > k){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return start;
    }

    private static int findDays(ArrayList<Integer> boards, int mid) {

        int curPartition = 1;
        int partionSum = 0;

        for (int num : boards) {

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
