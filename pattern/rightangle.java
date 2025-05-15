package pattern;
public class rightangle{
    public static void main(String[] args) {
        int num=6;
        for(int i=0;i<=5;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}