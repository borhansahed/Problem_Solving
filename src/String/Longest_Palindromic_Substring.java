package String;

public class Longest_Palindromic_Substring {

  static   int resultStart;
  static   int resultLength;
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public  static String longestPalindrome(String s) {

        if(s.length() <= 1) return s;

        for(int i = 0; i<s.length()-1; i++){
            expandRange(s, i, i);
            expandRange(s, i, i+1);
        }



      return s.substring(resultStart, resultStart+resultLength);

    }

    public static void expandRange(String s, int start, int end){

        while (start>=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }

        if(resultLength < end - start - 1){

            resultStart = start + 1;
            resultLength = end - start - 1;
        }

    }
}
