public class Search_In_Rot_Sorted_Arr{
    static int search(int[] arr,int target){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            } 
             else if(arr[mid]>arr[end]){ //mid to end is sorted
                if(target>arr[mid]&&target<=arr[end]){
                    st=mid+1;
                } else{
                    end=mid-1;
                }
             } 
              else { //start to mid is sorted
                if(target>=arr[st]&&target<arr[mid]){
                    end=mid-1;
                } else{
                    st=mid+1;
                }
              }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,1,2};
        int target=7;
        System.out.println(search(arr, target)); 

    }
}