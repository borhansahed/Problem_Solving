package recurrsion;

public class Search_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        System.out.println(search(arr,0,arr.length-1, 0));

    }

    public  static int  search(int[]arr, int start, int end,  int target){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) /2;

        if(arr[mid] == target)return mid;

        if(arr[start] <= arr[mid]){

            if( arr[start] <= target && target <= arr[mid]){
                return search(arr, start, mid-1, target);
            }else{
                return search(arr, mid+1, end, target);
            }
        }else{

            if(target <= arr[end] &&  arr[mid] <= target ){
                return search(arr,mid+1,end, target);
            }else{
                return search(arr, start, mid-1,target);
            }
        }
    }
}
