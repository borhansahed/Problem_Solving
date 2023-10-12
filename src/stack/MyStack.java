package stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(1);
        st.push(9);

        System.out.println(st);
        display(st);
//        while (!st.isEmpty()){
//
//            System.out.println(st.pop());
//        }
    }



    private static void display (Stack<Integer> st){

        if(st.isEmpty())return;

        int num = st.pop();
        display(st);
        System.out.print(num + " ");
        st.push(num);

    }
}
