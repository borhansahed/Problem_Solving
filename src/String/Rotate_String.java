package String;

public class Rotate_String {

    public static void main(String[] args) {
        System.out.println( rotateString("abcde", "abcde"));
    }

    public static boolean rotateString(String s, String goal) {

//        if(s.length() != goal.length()) return false;
//
//        if(s.equals(goal))return true;
//
//        for(int i = 0; i<s.length() - 1; i++){
//
//            String temp = s.charAt(s.length() - 1) + s.substring(0, s.length()-1);
//            if(temp.equals(goal))return true;
//            s = temp;
//
//        }
//
//        return false;

//        StringBuilder s = new StringBuilder(str);
//        int n = s.length();
//
//        while(n>0){
//            if(s.toString().equals(goal)) return true;
//            char ch = s.charAt(0);
//            s.deleteCharAt(0);
//            s.append(ch);
//            n--;
//        }
//        return false;

        return((s + s).contains(goal));
    }
}
