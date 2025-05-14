package loops;

public class DigitIsPalindrome {
    public static void main(String[] args) {
    int num=12344321;
    int original=num;
    int reversed=0;
    int count=0;
    while(num!=0){
        int newnum =num%10;
        reversed=reversed*10+newnum;
        num=num/10;
        count++;
        
    }if(original==reversed)
    System.out.println("the no.is palindrome "+count);
    else{
        System.out.println("the no. is not palindrome.");
    }


    }
}
