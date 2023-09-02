package String;

public class Depth_of_the_Parentheses {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        int open = 0;
        int max = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
                max = Math.max(max,open);
            }else{
                if(ch == ')'){
                    open--;
                }
            }
        }

        return max;
    }
}
