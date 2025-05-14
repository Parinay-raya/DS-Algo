
public class palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int start=0;
        int end=arr.length-1;
        boolean ispalindrome =true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[start]!=arr[end]){
                ispalindrome=false;
                break;
             }
             start++;
            end--;
            }
             
            if(ispalindrome){
                System.out.println("is palindrome : ");
            }
            else{
                System.out.println("arr is not palindrome : ");
            }
        
        
}
}