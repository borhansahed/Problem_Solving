package String;

public class Valid_Anagram {

    public static void main(String[] args) {
        String s = "Ana";
        System.out.println(isAnagram("ab", "ba"));
        System.out.println(s.substring(2+1));
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
