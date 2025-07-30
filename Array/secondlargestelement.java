public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 30, 40 };
        int secondlargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        
                if (arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
               }
               else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
               }
               
        }
     
         System.out.println(secondlargest + "is the second largest no.");
         System.out.println(secondsmallest+"is the secondsmallest no");
    }
}
