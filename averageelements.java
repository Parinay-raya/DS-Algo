public class averageelements {
    public static void main(String[] args) {
        int[] arr={20,30,50,60,100,50,80};
                int sum=0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
       double average = sum/arr.length;
       System.out.println("average of the given elements : "+average);
    }
}
