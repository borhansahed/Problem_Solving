package String;

import java.util.Arrays;
import java.util.Objects;

public class Reverse_Word {

    public static void main(String[] args) {
        String s = "  hello world  ";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        if(s.equals(""))return s;

        String[] temp = s.split(" ");
        StringBuilder ans = new StringBuilder();

         for(int i = temp.length -1; i>=0; i--){
             if(!(temp[i].equals(""))){

                     ans.append(" ");

                 ans.append(temp[i]);


             }

         }
         ans.deleteCharAt(0);

         return ans.toString();
    }
}
