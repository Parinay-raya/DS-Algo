package loops;

public class countnodigit {
    public static void main(String[] args) {
        int count = 0;
        int num = 1234456;

        while (num != 0) {
            // int digit = num % 10;  //to remove an last element 
            num=num/10;//remove last digit
            count++;
        }
        System.out.println(count);
    }

}
