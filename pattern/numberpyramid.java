package pattern;

public class numberpyramid {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
                
            }
            System.out.println("");

        }

        
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i;j++ ) {
                System.out.print(i+ " ");
              
                
            }
            System.out.println("");
            
        }
    }
    
}

