package loops;

public class CalculatePower {
    public static void main(String[] args) {
        int base = 7, exp = 3;
        int power = 1;

        for (int i = 1; i <= exp; i++) {
            power = power * base;
        }
        System.out.println(power);
    }
}
