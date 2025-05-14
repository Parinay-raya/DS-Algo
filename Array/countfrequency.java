public class countfrequency {
public static void main(String[] args) {
int[] arr = {10, 20, 20, 10, 30, 40,20, 40,50};
boolean[] visited = new boolean[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (visited[i]) {
            continue;
        }
        int count = 1; // Reset count for each unique element


        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
                visited[j] = true;
            }
        }

        // Print only if count is more than 1 (i.e., it's a duplicate)
        if (count > 1) {
            System.out.println("Element " + arr[i] + " occurs " + count + " times.");
        }
    }
}
}