public class evenodd {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
                System.err.println(arr[i]+"is even");

            }
            else{
                odd++;
                System.out.println(arr[i]+"is odd");
            }

        }

        System.out.println("odd " +odd +" even " + even);
    }
    
}
