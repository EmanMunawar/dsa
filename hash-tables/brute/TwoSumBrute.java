import java.util.Arrays;

public class TwoSumBrute {
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
        for(int i =0;i< numbers.length;i++){
            for (int j = i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
