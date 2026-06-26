import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

        public static void main(String[] args){
            int[] stones = {1,3,5,7,9,11,12,6};
            System.out.println("Stones: " + Arrays.toString(stones));
            System.out.println("Last Stone Weight: " + lastStoneWeight(stones));
            System.out.println();
            System.out.println("=== Time & Space Complexity ===");
            System.out.println("Time Complexity: O(n*n)");
            System.out.println("Space Complexity: O(n)");
            System.out.println("===============================");
        }
        public static int lastStoneWeight(int[] stones){
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int s:stones) {  // add stones to heap
                maxHeap.add(s);
            }
            while(maxHeap.size() > 1){      //smash stones
                int first = maxHeap.poll();
                int second = maxHeap.poll();
                if (first != second){
                    maxHeap.add(first-second);
                }
            }
            if(maxHeap.isEmpty()){
                return 0;
            }
            return maxHeap.poll();
        }

}
