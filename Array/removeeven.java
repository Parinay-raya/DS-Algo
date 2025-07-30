import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class removeeven {
    public static void main(String[] args){
        int[] arr={2,4,1,8,6,3,5,7};
        List<Integer> list =new ArrayList<>();
        for (int odd:arr) {
            if(odd%2!=0){
            list.add(odd);


            }
            
        }
        System.out.println(list);

    }
    
}
