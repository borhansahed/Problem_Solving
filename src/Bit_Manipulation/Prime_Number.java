package Bit_Manipulation;

import java.util.Arrays;

public class Prime_Number {

    public static void main(String[] args) {

//        for(int i = 2; i*i<=n; i++){
//
//            count++;
//            while(n % i == 0){
//                count++;
//                n = n/2;
//            }
//        }
//
//        System.out.println(count);
//
//          count = 0;
//
//        for(int i = 2; i<n; i++){
//            count++;
//            while(n % i == 0){
//                count++;
//                n = n/2;
//            }
//
//        }
//
//        System.out.println(count);

//        boolean[] prime = sieveAlgo(50);
        int[] lp = new int[24+1];
        int[] hp = new int[24+1];
//        for(int i = 0; i<prime.length;){
//            if(prime[i]){
//                System.out.println(i);
//            }
//            i++;
//        }
        primeFact(24, lp, hp);

    }

    private static  void primeFact(int n, int[] lp, int[]hp ){

        boolean[] is_prime = new boolean[n+1];

        Arrays.fill(is_prime, true);

        is_prime[0] = false;
        is_prime[1] = false;

        for(int i = 2; i<is_prime.length; i++){

            if(is_prime[i]){
             lp[i] = i;
             hp[i] = i;
            for(int j = 2*i; j<is_prime.length; j+=i){
                    is_prime[j] = false;
                    hp[j] = i;
                    if(lp[j] == 0){
                        lp[j] = i;
                    }
                }
            }
        }

        for(int i = 1; i<=24; i++){
            System.out.println(i + " " + lp[i] + " " + hp[i]);
        }
    }
    private static  boolean[] sieveAlgo(int n ){

        boolean[] is_prime = new boolean[n+1];

        Arrays.fill(is_prime, true);

         is_prime[0] = false;
         is_prime[1] = false;

         for(int i = 2; i<is_prime.length; i++){

             if(is_prime[i]){
                 for(int j = 2*i; j<is_prime.length; j+=i){
                     is_prime[j] = false;
                 }
             }
         }

         return is_prime;
    }
}
