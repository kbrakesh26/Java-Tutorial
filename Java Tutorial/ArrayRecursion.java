public class ArrayRecursion{
    static void printArray(int[] arr, int idx){
        if(idx==arr.length){
        return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    static int maxInArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
         int smallAns=maxInArray(arr,idx+1);
            return Math.max(arr[idx], smallAns);
         
    }
    public static void main(String[] args) {
        int[] arr={5,6,3,17,8,9};
        printArray(arr, 0);
        System.out.print("Maximum element is:");
        System.out.print(maxInArray(arr,0));

    }
}