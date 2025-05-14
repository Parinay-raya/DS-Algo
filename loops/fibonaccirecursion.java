package loops;

public class fibonaccirecursion {
     static int fib(int n){
     if (n <= 1)return n; {
            
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("the fibonacci of the no "+ n+" is"+fib(n));
       

    }

}
