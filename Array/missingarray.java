public class missingarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 8, 9, 10, 12, 13, 17 };

        for (int i = 0; i < arr.length-1; i++) {
            int next = arr[i + 1];
            int current = arr[i];
            if(next-current>1){
                for(int j=current+1;j<next;j++){
                    System.out.println(j);
                }
            }

        }

    }
}
