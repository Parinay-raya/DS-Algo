package loops;

public class sumofdigit {
    public static void main(String[] args) {
        int num = 456;
        int sum = 0;

        // For loop with same logic as while
        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            sum += digit;
        }

        System.out.println("Sum = " + sum);
    }
}
