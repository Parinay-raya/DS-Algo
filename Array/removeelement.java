import java.util.Arrays;

public class removeelement {

    

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 2, 2, 1,5, 2, 3, 4, 5,6 };
         int i = 0;
        int n = nums.length;
        int val = 2;
  
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // Overwrite with last valid element
                n--; // Shrink the array
            } else {
                i++; // Move forward
            }
        }
        System.out.println(n);
        System.out.println(Arrays.toString(nums));
    }
}

// boolean remove=false;
// int temp[] = new int[];
// int j;

// for(int i=0;i<=arr.length;i++){
// if(arr[i]==2){
// remove =true;
// temp[j]=arr[i+3];

// }

// }
// int[] uniquearray = new int[];
// for(int j=0;j<=arr.length;j++){
// uniquearray[j]=arr[i];
// }
// System.out.println(uniquearray);

// }

// }
