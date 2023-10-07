package Bit_Manipulation;

import java.util.Scanner;

public class Binary_Multiplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(2& -2);

        for(int i =10; i>=0; i--){
            System.out.print((-4>>i) & 1);
        }
        System.out.println();
        System.out.println(binary_multi(2,10));

    }

    private static int binary_multi(int a, int b){

        int ans = 0;

        while( b > 0){

            if((b&1) != 0){
                ans += a;
            }

            a += a;
            b>>=1;
        }

        return ans;
    }
}
