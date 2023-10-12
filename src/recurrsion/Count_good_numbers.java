package recurrsion;

public class Count_good_numbers {
    static  long mod = (long) 10e9+7;
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
//        System.out.println((long)10e9+7);
    }


    public static int countGoodNumbers(long n) {

        long even = pow((n+1)/2, 5)%mod;
        long odd = pow((n)/2, 4)%mod;

        return (int)((even * odd)%mod);
    }

    private static long pow(long n, long p){

        if(n == 0)return 1;

        long temp = pow(n/2, p);

        if(n % 2 == 0){
            return (temp*temp) % mod;
        }

        return (p * temp * temp)%mod;


    }
}
