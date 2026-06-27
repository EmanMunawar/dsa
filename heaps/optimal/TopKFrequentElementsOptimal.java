import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsOptimal {

        public static void main(String[] args){
            int[] numbers = {3,3,5,7,9,11,12,6};
            int k=2;
            System.out.println("Numbers: " + Arrays.toString(numbers));
            System.out.println("Top K Frequent Element: " + Arrays.toString(topKFrequent(numbers,k)));
            System.out.println();
            System.out.println("=== Time & Space Complexity ===");
            System.out.println("Time Complexity: O(n log k)");
            System.out.println("Space Complexity: O(n)");
            System.out.println("===============================");
        }
        public static int[] topKFrequent(int[] numbers,int k) {// function to find kth largest element
            HashMap<Integer,Integer> frequency = new HashMap<>();
            for (int n:numbers){
                frequency.put(n, frequency.getOrDefault(n,0)+1);

            } // create MinHeap
            PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() -b.getValue());

            for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
                minHeap.add(entry);
                if (minHeap.size() > k){
                    minHeap.poll();
                }
            }
            int[] ans = new int[k];
            for(int i = k-1; i >= 0;i--) {   // store result
                ans[i] = minHeap.poll().getKey();
            }
            return ans;
}}
