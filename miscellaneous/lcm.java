package miscellaneous;

public class lcm {
    public static void main(String[] args) {
        int a = 25;
        int b = 11;
        int lcm = (a > b) ? a : b; // Start from the greater of the two

        // Use loop to find the smallest multiple that is divisible by both a and b
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break; // Found LCM
            }
            lcm++;
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
