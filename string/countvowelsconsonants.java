package string;

public class countvowelsconsonants {
    public static void main(String[] args) {
        String str = "Hello world";
        str = str.toLowerCase();
        // int vowels=0,consonants=0;
        String vowels = "";
        String consonants = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels = vowels + ch + " ";
                } else {
                    consonants = consonants + ch + " ";
                }
            }

        }
        System.out.println("vowels -" + vowels);
        System.out.println("consonants -" + consonants);

    }
}