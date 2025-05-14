public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 30, 40 };
        int secondlargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

        }
         System.out.println(secondlargest + "is the second largest no.");
    }
}
