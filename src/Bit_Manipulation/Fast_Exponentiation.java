package Bit_Manipulation;

public class Fast_Exponentiation {

    public static void main(String[] args) {
        System.out.println(binaryExponentiation(2,10));
    }

    private static  int binaryExponentiation(int a, int b){

        int ans = 1;
        int count = 0;
        while( b>0){
            if((b & 1) != 0){
                ans *= a;
            }
            a *= a;
            b>>=1;
            count++;
        }

        return ans;
    }
}
