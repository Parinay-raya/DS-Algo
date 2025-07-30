package practice;
public class reversestring{
    public static void main(String[] args) {
        
   
String name = "HEllo world";
char []arr=name.toCharArray();
int start=0; 
int end=arr.length-1;
char temp;


while(start<end){
    temp= arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
    
   }  
   String reversed=new String(arr);
   System.out.println(reversed);
}
}
