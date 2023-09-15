package recurrsion;

public class Practice {
    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(fibonacci(8));
//        System.out.println(naturalNum(5));
//        int[] arr = {1,2,3,4,5,3};
//        System.out.println(isSorted(arr,0));
        System.out.println(tailingProblem(4));
    }

    public static int factorial(int n) {

        if (n < 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static int fibonacci(int n){

        if(n< 2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int naturalNum (int n){

        if(n == 1){
            return 1;
        }

        return n  + naturalNum(n-1);
    }

    public  static boolean isSorted(int[] arr, int i){

        if(arr.length - 1 == i){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }

    public static  int tailingProblem(int n){

        if(n <=1){
            return 1;
        }

        return tailingProblem(n-1) + tailingProblem(n - 2);
    }

}
