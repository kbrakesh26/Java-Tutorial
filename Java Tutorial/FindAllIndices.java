import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAllIndices{
    static ArrayList<Integer> allIndices(int[] arr, int n, int target, int idx){
      if(idx >= n){
        return new ArrayList<>();
      }
      ArrayList<Integer> ans= new ArrayList<>();
      if(arr[idx]==target){
        ans.add(idx);
      }
      ArrayList<Integer> smallAns= allIndices(arr, n, target, idx+1);
      ans.addAll(smallAns);
      return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,6,4,6,7,8,6};
        int target=6;
        int n=arr.length;
        ArrayList<Integer> ans=allIndices(arr, n, target, 0);
        for(Integer i: ans){
            System.out.println(i);
        }
    }
}