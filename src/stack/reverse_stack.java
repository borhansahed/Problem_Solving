package stack;

import java.util.Arrays;
import java.util.Stack;

public class reverse_stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.addAll(Arrays.asList(1,2,3,4));
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }

    public static void reverseStack(Stack<Integer> stack) {


        if(stack.size() == 1)return;

        int num = stack.pop();

        reverseStack(stack);
        reverse(stack, num);

    }

    private static void reverse(Stack<Integer> s, int n){

        if(s.isEmpty()){
            s.push(n);
            return;
        }

        int num = s.pop();

        reverse(s,n);
        s.push(num);

    }
}
