import java.util.Arrays;
import java.util.Scanner;

public class leftrotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        System.out.print("Enter a number from which you want to rotate the array : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k > arr.length) {
            System.out.println("The number is greater than the array length.");
        }

        reverse(arr, start, k - 1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, k, end);
        System.out.println(Arrays.toString(arr));
        reverse(arr, start, end);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static void reverse(int[] ary, int start, int end) {
        while (start < end) {
            int temp = ary[start];
            ary[start] = ary[end];
            ary[end] = temp;
            start++;
            end--;
        }
    }
}
