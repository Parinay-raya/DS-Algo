package pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int num = 6;
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }
}
