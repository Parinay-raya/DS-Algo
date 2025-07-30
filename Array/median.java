public class median {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        double median=0 ;
        int n=arr.length;

            if(n%2!=0){
                median =arr[n/2];
            }
            else {
                median =((arr[n/2-1])+ arr[n/2])/2;
            }
      
        System.err.println("the median "+median);

    }
    
}
