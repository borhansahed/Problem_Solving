package Sliding_window;

import javax.imageio.ImageTranscoder;
import java.util.HashMap;

public class Longest_Substring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("tmmzuxtttmmmm"));
    }
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();


        int i = 0, j = 0;
        int maxLen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int indexOfChar = map.get(ch);
                if(indexOfChar > i){
                    i = indexOfChar + 1;
                }

            }
                map.put(ch, j);
                j++;
            maxLen = Math.max(maxLen, (j - i));


        }

    return maxLen;
    }
}
