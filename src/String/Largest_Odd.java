package String;

public class Largest_Odd {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("239537672423884969653287101"));

    }

    public static String largestOddNumber(String num) {

        int i = num.length()-1;
        while(i>=0){
            int isOdd = num.charAt(i) - '0';

            if(isOdd % 2 == 1)return num.substring(0,i+1);
            i--;

        }
        return "";
    }
}
