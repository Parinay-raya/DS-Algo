package loops;

public class nodivisible {
    public static void main(String[] args) {
        int num = 100;

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            boolean found = false; // move this outside the loop
            for (int i = 15; i <= num; i += 15) {
                System.out.println("The number divisible by 3 and 5 is: " + i);
                found = true;
            }

            if (!found) {
                System.out.println("Not a single number is divisible by 3 and 5.");
            }
        }
    }
}
