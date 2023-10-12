package Queue;

import java.util.*;

public class Non_repeating {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();


        System.out.println(FirstNonRepeating("aabcc"));


    }

    public static String FirstNonRepeating(String A)
    {
        Map<Character, Integer> map = new HashMap<>(26);
        Queue<Character> q = new ArrayDeque<>(26);
        StringBuilder s = new StringBuilder();

        for(int i = 0; i<A.length(); i++ ){

            char ch = A.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
            q.add(ch);

            while(!q.isEmpty()){

                if(map.get(q.peek()) > 1){
                    q.poll();
                }else{
                    s.append(q.peek());
                    break;
                }
            }

            if(q.isEmpty()){

                s.append('#');
            }
        }


        return s.toString();
    }
}
