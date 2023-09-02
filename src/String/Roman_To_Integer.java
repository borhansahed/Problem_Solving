package String;

import java.util.HashMap;

public class Roman_To_Integer {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);



        int i = s.length() - 1;
        int prev = 0;
        int ans = 0;

        while(i>=0){
            char ch = s.charAt(i);
            int value = map.get(ch);

            if(i != s.length() - 1){
                if(value < prev){
                    ans-= value;

                }else{
                    ans+=value;
                }

                prev = value;
            }else{
                prev = value;
                ans+=value;
            }

            i--;
        }

        return ans;
    }
}
