import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimal {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        int target = 3;
        System.out.println("Array:" + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        int[] answer = twoSum(numbers,target);
        System.out.println("Indexes: " + Arrays.toString(answer));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static int[] twoSum(int[] numbers,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<numbers.length;i++){
            int comp = target-numbers[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp)};
            }
            map.put(numbers[i],i);

        }
        return new int[]{-1,-1};
    }
}
