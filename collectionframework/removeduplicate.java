package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,5,3,4,5,1,2,3,4,6};
        Arrays.sort(arr);
        int i=0;
List<Integer> list = new ArrayList<>();
            for(int unique:arr){
                if(!list.contains(unique)){
                     list.add(unique);

                }
            }
        
        System.out.println(list);

        // Set<Integer> seen =new LinkedHashSet<>();
        // for(int val:arr){
        //     seen.add(val);
        // }
        // System.out.println(seen);



    
    }
    
}

