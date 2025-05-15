package pattern;

public class alteringtriangle {
    public static void main(String[] args) {
        int num = 5; // Number of rows

        for (int i = 1; i <= num; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for each column in the row
                if ((i + j) % 2 == 0) {
                    System.out.print("1 "); // Print 1 if (i + j) is even
                } else {
                    System.out.print("0 "); // Print 0 if (i + j) is odd
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

    }

}
