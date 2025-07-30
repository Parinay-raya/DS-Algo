package practice;

public class nonrepeating {
    public static void main(String[] args) {
        String str ="pzzhhiie";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean isUnique =true;

            for(int j=0;j<str.length();j++){
                if(i!=j &&str.charAt(j)==str.charAt(i)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println("first non repeating character "+ str.charAt(i));
                return;
            }

        }
        System.out.println("repeating character");

    }
    
}
