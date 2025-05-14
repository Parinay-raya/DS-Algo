package loops;

public class multiplicationtable {
    public static void main(String[] args) {
        int num = 10;
        // for(int i=1;i<=10;i++){
        // System.out.printf("%d X %d = %d\n", num, i, num*i );
        // }
            int i = 1;

        while (i<= 10) {
            int product = num * i;
            System.out.println(num + " x "+ i +" = " + product);

            i++;

        }
    }

}
