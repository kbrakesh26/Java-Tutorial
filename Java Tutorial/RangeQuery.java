import java.util.Scanner;
public class RangeQuery{
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    static int [] makePrefixSumArray(int []arr){
       for(int i=1;i<arr.length;i++){
        arr[i]+= arr[i-1];
       }
       return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n+1];
        System.out.println("Enter the "+n+" elements of the array");
        for(int i=1; i<=n;i++){
            arr[i]=sc.nextInt();
        }
         int []prefSum = makePrefixSumArray(arr);
         System.out.println("Enter the number of query");
         int q=sc.nextInt();
         while(q-->0){
            System.out.println("Enter the range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("Sum: "+ ans);
         }
    }
}