package Array.Medium;
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,2,0,1,2};
        sort012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private  static void sort012(int[] a, int n){
        int s = 0;
        int m = 0;
        int e = n-1;

        while(m <= e){

            switch (a[m]) {
                case 0 -> {
                    int temp = a[m];
                    a[m] = a[s];
                    a[s] = temp;
                    m++;
                    s++;
                }
                case 1 -> {
                    m++;
                }
                case 2 -> {
                    int temp = a[m];
                    a[m] = a[e];
                    a[e] = temp;

                    e--;
                }
                default -> {
                }
            }
    }
}
}
