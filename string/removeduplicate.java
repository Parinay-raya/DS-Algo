package string;

public class removeduplicate {
    public static void main(String[] args) {
        String input="programming is a good as well as java";
        String result="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(result.indexOf(ch)==-1){
                result +=ch; 
            }
        }
        System.out.println("original :"+input);
        System.out.println("without duplicate :"+result);
    }
            
}

