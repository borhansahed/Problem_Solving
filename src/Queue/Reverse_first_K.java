package Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse_first_K {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<k; i++){

            st.push(q.poll());
        }


        while(!st.isEmpty()){
            q.add(st.pop());
        }


        int size = q.size() - k;

        while(size > 0){
            q.add(q.poll());
            size--;
        }

        return q;

    }
}
