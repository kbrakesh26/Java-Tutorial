import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSorting{
    static void bucketSort(float[] arr){
        int n=arr.length;
        ArrayList<Float>[] bucket=new ArrayList[n];
        //Creating empty buckets
        for(int i=0;i<n;i++){
            bucket[i]=new ArrayList<Float>();
        }
        //Add elements into the buckets
        for(int i=0;i<n;i++){
            int bucketIdx=(int) arr[i]*n;
            bucket[bucketIdx].add(arr[i]);
        }
        //Sort each bucket indivisually
        for(int i=0;i<bucket.length;i++){
            Collections.sort(bucket[i]);
        }
        // merge all the buckets to get final sorted array
        int index=0;
        for(int i=0;i<bucket.length;i++){
        ArrayList<Float> currBucket=bucket[i];
        for(int j=0; j<currBucket.size();j++){
            arr[index ++]=currBucket.get(j);
        }
        }
    }
    public static void main(String[] args) {
        float[] arr={0.2f,0.5f,0.37f,0.8f,0.9f};
        bucketSort(arr);
        for(float value : arr){
            System.out.print(value + " ");
        }
    }
}