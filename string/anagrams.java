package string;

import java.util.HashMap;
import java.util.Map;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            freq1.put(str1.charAt(i), freq1.getOrDefault(str1.charAt(i), 0) + 1);
            freq2.put(str2.charAt(i), freq2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        if (freq1.equals(freq2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
