import java.util.Arrays;

public class onlyonce {
    public static void main(String[] args) {
        int arr[] = { 10, 54, 25, 10, 45, 25, 54, 45, 10, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " appears more than once. " + count + " times.");
            }
        }
    }
}
