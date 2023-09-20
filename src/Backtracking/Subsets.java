package Backtracking;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {


    }

    private static void subset(String s, String ans){

        if(s.isEmpty()){
            if(ans.isEmpty()){
                System.out.println("I am here");
            }
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        subset(s.substring(1), ans+ch);
        subset(s.substring(1), ans);
    }
}
