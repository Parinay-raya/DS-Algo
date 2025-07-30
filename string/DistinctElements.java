package string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DistinctElements {
    public static void main(String[] args) {
        String str = "It is a good language. Java is a good Programming language.";

        String[] str2 = str.toLowerCase().split("\\W+");
        HashSet<String> freq = new LinkedHashSet<>();

        for (int i = 0; i < str2.length; i++) {
            freq.add(str2[i]);
        }

        for (String word : freq) {
            System.out.println(word);
        }
    }
}
