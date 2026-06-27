import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElementsBrute {
    public static void main(String[] args){
        int[] numbers = {3,3,5,7,9,11,12,6};
        int k=2;
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Top K Frequent Element: " + Arrays.toString(topKFrequent(numbers,k)));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("===============================");
    }
    public static int[] topKFrequent(int[] numbers,int k) {// function to find kth largest element
        HashMap<Integer,Integer>  frequency = new HashMap<>();
        for(int n:numbers){     // count frequency
            frequency.put(n,frequency.getOrDefault(n,0)+1);
    }
        int [] ans = new int[k];
        for(int i=0;i<k;i++) {   // most frequent
            int maxFRequency =0;
            int element =0;
            for(int key:frequency.keySet()){
                if (frequency.get(key)> maxFRequency){
                    maxFRequency = frequency.get(key);
                    element = key;
                }
            }
            ans[i] = element;
            frequency.remove(element);
        }
        return ans;
}
}
