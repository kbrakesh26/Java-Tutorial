public class BinarySearch{
   /*  static boolean binarySearch(int[] arr, int target){
        int n= arr.length;
        int st=0;
        int end=n-1;
        while(st <= end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return true;
            } else if (target<arr[mid]) {
              end=mid-1;
            } else if(target>arr[mid]){
                st=st+1;
            }
        }
        return false;
    } 
    */
    static boolean recursiveBnarysearch(int[] arr,int st,int end,int target){
    if(st>end) return false;
    int mid=(st+end)/2;
        if(target==arr[mid]){
            return true;
        } else if(target<arr[mid]){
            return recursiveBnarysearch(arr, st, mid-1, target);
        } else{
            return recursiveBnarysearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9};
        int target=0;
        while(target != 10){
            System.out.printf("%d is present %b \n", target , binarySearch(arr, target));
            System.out.printf("%d exist in the array %b \n",target,recursiveBnarysearch(arr, 0, arr.length-1, target) );
            System.out.println();
            target++;
        }
    //   System.out.println("The target is present in the Array: " + binarySearch(arr, target));
    //   System.out.println(binarySearch(arr, target));
}
}