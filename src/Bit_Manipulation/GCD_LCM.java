package Bit_Manipulation;

public class GCD_LCM {
    public static void main(String[] args) {
    /*
    GCD = GREAT COMMON DIVISOR
    LCM =  (num1 * num2) / GCD
     */

//        System.out.println(7* 191/gcd(7,191));

//        System.out.println(normalWayOfGcd(12,18));
//        normalWayOfGcd(100,18);

        System.out.println(superPow(7,new int[]{1,1,4,0}));
    }


    public  static int gcd(int a, int b){


        while (b != 0){

           int temp = a;
           a = b;
           b = temp % b;
        }

        return a;
    }
    public  static void normalWayOfGcd(int a, int b){


       int i = 2;

       while(a != 1){

           if( a % i == 0){
               a = a/i;
               System.out.print(i + "-> ");
           }else{
               i++;
           }
       }

        System.out.println();
       i = 2;
       while(b != 1){

           if( b % i == 0){
               b = b/i;
               System.out.print(i + "-> ");
           }else{
               i++;
           }
       }


    }



    public  static int coPrime(int n){


       int count = 0;

       for(int i = 1; i<n; i++){
           if(gcd(i,n) == 1){
               count++;
           }
       }

       return count;
    }


    public static int superPow(int a, int[] b) {

        int bmod = 0;

        for(int n : b){
            bmod = (bmod * 10  + n) % 1140;
        }

        if(bmod == 0)bmod = 1140;
        return binaryExp(a, bmod, 1337);
    }

    private  static int binaryExp(int a, int b, int m){

        a %= m;
        int ans = 1;

        while(b>0){

            if((b&1) != 0){
                ans = (ans * a) % m;
            }

            a = (a * a) % m;
            b>>=1;
        }

        return ans;

    }
}
