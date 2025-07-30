package practice;
public class RunningCountEasy {
    public static void main(String[] args) {
        String str = "aaabbcaacca";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            // If current character is same as previous
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Print count and previous character
                System.out.print(count + "" + str.charAt(i - 1));
                count = 1; // reset count
            }
        }

        // Print for the last character group
        System.out.print(count + "" + str.charAt(str.length() - 1));
    }
}
