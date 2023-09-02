package String;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public  static String longestPalindrome(String s) {

        if(s.length() <= 1) return s;

        if(isPalindrome(s)){
            return s;
        }

        String ans = "";
        for(int i = 0; i<s.length(); i++){
            boolean left = isPalindrome(s.substring(0, s.length() -i-1));
            boolean right = isPalindrome(s.substring(i));

           if(left){
               ans = s.substring(0, s.length() - i - 1);
               break;
           }
           if(right){
               ans = s.substring(i);
               break;
           }
        }

  return ans;


    }

    public static boolean isPalindrome(String s){

        if(s.length() <= 1)return false;

        int i = 0;
        int j = s.length() - 1;

        while( i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }


        return true;
    }
}
