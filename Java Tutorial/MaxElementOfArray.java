public class MaxElementOfArray {
    public static void main(String[] args) {
        int[] arr={1,21,35,6,9,3,12,7};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The max. element in the array is:"+ max);
    }
    
}
