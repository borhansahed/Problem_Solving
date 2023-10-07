package Bit_Manipulation;

public class Count_setBits {

    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
    public static int countSetBits(int n){

        if(n == 0)return 0;

        int x = powerOfTwo(n);
        int BitBeforePowerTwo= (1<<x-1) * x;
        int afterPowerTwo = n - (1<<x) + 1;
        int rest = n - (1<<x);
        return BitBeforePowerTwo + afterPowerTwo + countSetBits(rest);

    }


    private static int powerOfTwo (int n){

        int x = 0;

        while((1<<x) <= n){
            x++;
        }

        return x-1;
    }
}
