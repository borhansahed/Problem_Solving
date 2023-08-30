package String;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("valid".lastIndexOf("id"));
//        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String ans = strs[0];
        int i = 1;
        while(i<strs.length){
            while(strs[i].indexOf(ans) != 0){
                ans = ans.substring(0, ans.length()-1);
            }
            i++;
        }

        return ans;
    }
}
