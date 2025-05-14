package loops;

public class countnodigit {
    public static void main(String[] args) {
        int count = 0;
        int num = 1234456;

        while (num != 0) {
            int digit = num % 10;
            num=num/10;
            count++;
        }
        System.out.println(count);
    }

}
