package string;

public class reversestring {
    public static void main(String[] args) {
        String str="Indian";
        char[] arr=str.toCharArray();
       int start=0, end = arr.length-1;

    while(start<end){
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

    }
    String reversed = new String(arr);
    System.out.println(reversed);
    // System.out.println(Arrays.toString(arr));

}
}