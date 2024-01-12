import java.util.* ;
import java.io.*; 
public class Solution {

	public static int[] specialSubarray(int n, int[] arr) {
		// Write your code here.
		Map<Integer,Integer> lastIndexMap=new HashMap<>();
		int mostFrElt=-1;
		int maxFreq=0;
		
		for(int i=0;i<n;i++){
			int num=arr[i];
			lastIndexMap.put(num,i);

			int frequency=i-lastIndexMap.getOrDefault(num, -1);
		}
		if(freqency > maxFreq || (freqency==maxFreq && num<mostFrElt)){
			mostFrElt=num;
			maxFreq=frequency;
		}

	}

		List<Integer> specialSubArrList=new ArrayList<>();
		int lastIndexOfMostFreqElt=-1;
		for(int i=0;i<n;i++){
			int num=arr[i];	
		if(num==mostFrElt){
					if(lastIndexOfMostFreqElt !=-1){
			for(int j=lastIndexOfMostFreqElt;j<=i;j++){
				specialSubArrList.add(arr[j]);
			}
		}
		lastIndexOfMostFreqElt=i;
		}
	}

	int[] specialSubarray=new int[specialSubArrList.size()];
	for(int i=0; i<specialSubArrList.size();i++){
		specialSubarray[i]=specialSubArrList.get(i);
	}
	return specialSubarray;
	}
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 3, 4, 3, 5};
        int[] result = specialSubarray(arr.length, arr);

        System.out.println(Arrays.toString(result));
    }

}
