package recurrsion;

public class Remove_Duplicates_String {
    public static void main(String[] args) {

        String s = "aazbby";
        System.out.println(removeConsecutiveDuplicates(s));
    }
    public static String removeConsecutiveDuplicates(String s) {


        return solve(s, "");
    }


    private static String solve(String s, String ans){

        if(s.length() == 0){
            return ans;
        }


        char ch = s.charAt(0);

        if(ans.length() == 0){
            ans+=ch;
        }
        else if( ans.charAt(ans.length() - 1) != ch){
            ans+=ch;
        }
         return solve(s.substring(1), ans);


    }
}
