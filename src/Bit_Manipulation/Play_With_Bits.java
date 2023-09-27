package Bit_Manipulation;

public class Play_With_Bits {

    public static void main(String[] args) {
        printNum(9);

        printNum(9 |(1<<1));
    }

    private static void printNum(int n){

        for(int i = 10; i>=0; i--){
            System.out.print(n >> i & 1);
        }
        System.out.println();
    }
}
