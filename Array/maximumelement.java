public class maximumelement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 30, 40 };
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("maximum element in an array:"+max);
    }
}
