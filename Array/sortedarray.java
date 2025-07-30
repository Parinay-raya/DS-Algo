import java.util.Arrays;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 8, 4, 9, 5, 6 };
                // int[] arr = { 10, 20,30,40,50};

        boolean isincreasing = true;
        boolean isdecreasing = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1])
                isdecreasing = false;

            else if (arr[i] > arr[i + 1]) {
                isincreasing = false;
            }
        }

        if (isdecreasing) {
            System.out.println("the array elements is decreasing order" +Arrays.toString(arr));
        } else if (isincreasing) {
            System.out.println("the array elements is increasing order" + Arrays.toString(arr));
        } else{
            System.out.println("array is not sorted");
    }
}

}