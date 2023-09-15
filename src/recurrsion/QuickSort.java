package recurrsion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,6,3,5};
        quickSort(arr, 0, arr.length -1);

        for(int a: arr){
            System.out.print(a+" -->");
        }
        System.out.println();
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if(low >= high)return;

        int partion = partition(arr, low, high);

        quickSort(arr, low, partion - 1);
        quickSort(arr, partion, high);
    }
    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];
        int i = low-1;
        int j = low;

        while(j <= high){

            if( arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        return i;
    }
}
