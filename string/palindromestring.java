package string;

public class palindromestring {
    public static void main(String[] args) {
        String str = "abcdcba";
        int start = 0;
        int end = str.length() - 1;
        boolean ispalindrome = true;
       while(start<end) {
            if (str.charAt(start)!= str.charAt(end)) {
                ispalindrome = false;
                break;
                
            }
            start++;
            end--;

        }
        if(ispalindrome)
        System.out.println("is palindrome");
        else{
            System.out.println("is not palindrome");
        }

    }

}
