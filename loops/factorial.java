package loops;

public class factorial {
    public static void main(String[] args) {
      long  factorial=1;
      int num=20;
      for(int i=num;i>=1;i--){
        factorial=factorial*i;

      }
      System.out.println("the factorial of a no."+factorial);
    }
    
}
