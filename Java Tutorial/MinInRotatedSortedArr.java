public class MinInRotatedSortedArr{
    static int findMin(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st + (end-st)/2;
            if(arr[mid] < arr[n-1]){
                ans=arr[mid];
                end=mid-1;
            } else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.print("The minimum value in the given array is: ");
        System.out.println(findMin(arr));
        
    }
}