package stack;

import java.util.Arrays;
import java.util.Stack;

public class Insert_At_Bottom {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
       st.addAll(Arrays.asList(1,2,3,4));
        System.out.println(insertAtBottom(st,5));

    }

    public static Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {

        solve(St,X);

        return St;

    }

    private static void solve(Stack<Integer> st, int x){

        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int num = st.pop();

        solve(st,x);
        st.push(num);

    }
}
