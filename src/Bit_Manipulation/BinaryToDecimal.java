package Bit_Manipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(10>>1);
        for(int i = 0; i<4; i++){

            if((4 & (1<<i)) != 0){
                System.out.println(i);
            }
        }
    }
}
