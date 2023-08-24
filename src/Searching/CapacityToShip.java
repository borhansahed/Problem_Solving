package Searching;

import java.util.Scanner;

public class CapacityToShip {
    public static void main(String[] args) {
      int[] weights = {3,2,2,4,1,4};

        System.out.println(shipWithinDays(weights, 3));
    }

    public static int shipWithinDays(int[] weights, int days) {

        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int weight : weights) {
            start = Math.max(start, weight);
            end += weight;
        }


        while (start <= end) {

            int mid = start + (end - start) / 2;

            int totalDays = findDays(weights, mid);

            if (totalDays <= days) end = mid - 1;
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static int findDays(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for (int weight : weights) {

            if ((load + weight) > capacity) {
                days += 1;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days;
    }
}
