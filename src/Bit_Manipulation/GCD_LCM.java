package Bit_Manipulation;

public class GCD_LCM {
    public static void main(String[] args) {
    /*
    GCD = GREAT COMMON DIVISOR
    LCM =  (num1 * num2) / GCD
     */

        System.out.println(gcd(100,18));

//        System.out.println(normalWayOfGcd(12,18));
        normalWayOfGcd(100,18);


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
}
