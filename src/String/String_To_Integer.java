package String;

public class String_To_Integer {

    public static void main(String[] args) {
        String s = "-42";

        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {

        if(s == null || s.trim().length() == 0) return 0;

        int index = 0;
        boolean isNegative = false;
        long result = 0;
        while(s.charAt(index) == ' '){
            index++;
        }

        if(s.charAt(index) == '-'){
            isNegative = true;
            index++;
        }

        while(index < s.length() && s.charAt(index) <= '9' && s.charAt(index) >= '0'){

            result *= 10;
            result += s.charAt(index) - '0';


            if(isNegative  && -1 * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(  result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;


            index++;

        }
        return isNegative ? -1 *  (int) result : (int) result;
    }
}
