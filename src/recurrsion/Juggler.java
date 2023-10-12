package recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Juggler {

    public static void main(String[] args) {
        System.out.println(jugglerSequence(6));
    }
    static List<Integer> jugglerSequence(int N){

        List<Integer> list = new ArrayList<>();


        solve(list, N);

        return list;

    }

    private static void solve(List<Integer> list, int n){

        if(n <= 1){
            list.add(1);
            return;
        }

        if(n  % 2 == 0){
            list.add(n);
            solve(list,((int)(Math.pow(n,  (double) 1 /2))));
        }else{
            list.add(n);
            solve(list,(int)Math.pow(n,  (double) 3 /2));
        }
    }
}
