package String;

public class Valid_Anagram {

    public static void main(String[] args) {
        System.out.println((int)'0');
        String s = "sahed";

        for(char ch: s.toCharArray()){

        }

    }

    public static  boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
