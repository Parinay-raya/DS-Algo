package pattern;

public class RightAligned {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            // Print spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
