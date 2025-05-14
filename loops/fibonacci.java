package loops;

public class fibonacci {
    public static void main(String[] args) {
        int num=35;
        int first=0;
        int second=1;
        @SuppressWarnings("unused")
        int next=first+second;
        System.out.println("the fibonacci of  "+ num+ " is" );
        System.out.println(first+" ");

        for(@SuppressWarnings("unused")
        int i=0;second<=num;i++){
           
            System.out.print(first+" ");
            
            int third= first+second;
             first=second;
             second=third;
            }
            
           

        }
        
    }
    

