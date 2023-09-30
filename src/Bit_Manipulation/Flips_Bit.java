package Bit_Manipulation;

public class Flips_Bit {
    public static void main(String[] args) {
        System.out.println(minFlips(2, 6, 5));
    }

    public static int minFlips(int a, int b, int c) {

        if ((a | b) == c) {
            return 0;
        }
       int ans = 0;
        for(int i = 0; i<32; i++){

            int x,y,z;

            x= ((a>>i) & 1);
            y= ((b>>i) & 1);
            z= ((c>>i) & 1);

            int cnt = x + y;

            if( z == 0)ans += cnt;
            else{
              if(cnt == 0)ans++;
            }
        }

        return ans;

    }
}
