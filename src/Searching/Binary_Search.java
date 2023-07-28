package Searching;

public class Binary_Search {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,5));
    }

    static int binarySearch(int[] arr, int value){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] ==value){
                return mid;
            } else if (arr[mid] > value) {

                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

}
