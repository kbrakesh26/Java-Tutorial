import java.util.Scanner;

public class SearchInArray{
    static boolean search(int[] arr, int n, int target, int idx){
        //BASE CASE
      if(idx >=n) return false;

      if(arr[idx]==target) return true;
      //RECURSIVE WORK
      return (search(arr,n,target,idx+1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,6,8,9};
        System.out.println("ENTER THE TARGET VALUE: ");
        int target=sc.nextInt();
        int n=arr.length;
        if(search(arr,arr.length,target,0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}