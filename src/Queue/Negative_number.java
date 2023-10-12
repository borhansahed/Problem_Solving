package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Negative_number {

    public static void main(String[] args) {
        Deque<Long> q = new ArrayDeque<>();
        q.addFirst(1L);
        q.add(2L);
        q.addFirst(3L);
        long[] arr = {-8,2,3,-6,10};
        long[] ans = printFirstNegativeInteger(arr, arr.length, 2);
        System.out.println(Arrays.toString(ans));

    }

    public static long[] printFirstNegativeInteger(long A[], int N, int K) {

        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Long> list = new ArrayList<>();


        for (int i = 0; i < K; i++) {

            if (A[i] < 0) {
                dq.add(i);
            }
        }


        // store in list

        if (dq.size() > 0) {
            list.add(A[dq.peek()]);
        } else {
            list.add((long) 0);
        }


        for (int i = K; i < N; i++) {


            if (!dq.isEmpty() && i - dq.peek() >= K) {
                dq.poll();
            }


            if (A[i] < 0) {
                dq.add(i);
            }


            if (dq.size() > 0) {
                list.add(A[dq.peek()]);
            } else {
                list.add((long) 0);
            }

        }

        long[] ans = new long[list.size()];
        int i = 0;
        for (long n : list) {
            ans[i++] = n;

        }

        return ans;
    }

}
