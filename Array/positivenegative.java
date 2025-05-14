public class positivenegative {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,-4,2,3,4};
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
        }
        System.out.println("the total no of positive elements"+ positive);
        System.out.println("the total no of negative elements"+negative);
    }
}
