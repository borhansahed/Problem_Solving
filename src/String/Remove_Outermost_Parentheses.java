package String;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {


    }

    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int open  = 0;

        for(int i = 0; i<s.length(); i++){

         if(s.charAt(i) == '('){
             if(open > 0) ans.append(s.charAt(i));
             open++;
         }else{
             if(open > 1){
                 ans.append(s.charAt(i));
             }
             open--;
         }

        }
     return ans.toString();
    }
}
