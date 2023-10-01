package Bit_Manipulation;

public class Binary_Multiplication {

    public static void main(String[] args) {
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
