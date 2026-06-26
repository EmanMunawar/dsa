import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElementInArrayOptimal {
    public static void main(String[] args){
        int[] numbers = {1,3,5,7,9,11,12,6};
        int k=1;
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Kth Largest Element: " + findKthLargestElement(numbers,k));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity: O(n log k)");
        System.out.println("Space Complexity: O(k)");
        System.out.println("===============================");
    }
    public static int findKthLargestElement(int[] numbers,int k) {// function to find kth largest element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();     // create minHeap
        for(int number: numbers){
            minHeap.add(number);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

}
