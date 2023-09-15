package recurrsion;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2};
        margeSort(arr,0,arr.length-1);
        for(int a: arr){
            System.out.print(a+" -->");
        }
        System.out.println();


    }

    public static void margeSort(int[] arr, int start, int end){

        if(start >= end){
            return;
        }
        int mid = start + (end - start) /2;

        margeSort(arr,start, mid);
        margeSort(arr,mid+1, end);
        marge(arr,start, mid, end);
    }

    private static void marge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <=mid && j <= end){

            if(arr[i] < arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];

            }
            k++;
        }

        while (i<= mid){
            temp[k++] = arr[i++];
        }
        while (j<= end){
            temp[k++] = arr[j++];
        }

        k = 0;

        for(int l = start; l<=end; l++){
            arr[l] = temp[k++];
        }

    }
}
