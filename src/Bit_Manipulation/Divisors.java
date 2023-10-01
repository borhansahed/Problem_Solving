package Bit_Manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        divisor(n);
//        System.out.println(Math.sqrt(n));

        String s = "Let's take LeetCode contest";
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == ' '){

                ans.append(str.reverse());

                str.delete(0, str.length());
                if(i != str.length() - 1){
                    ans.append(" ");
                }
            }else{
                str.append(s.charAt(i));
            }

        }
        System.out.println(ans);
    }

    private static void divisor(int n){
        int count = 0, sum = 0;
        for(int i = 1; i*i<=n; i++){
            if(n % i == 0){
               count++;
                System.out.println(i + " " + n/i);
                sum+=i;

                if(n/i != i){
                    count++;
                    sum+= n/i;
                }
            }
        }
        System.out.println();
        System.out.println("Count and Sum");
        System.out.println(count);
        System.out.println(sum);
    }
}
