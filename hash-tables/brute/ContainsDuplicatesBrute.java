import java.util.Arrays;

public class ContainsDuplicatesBrute {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,4,5};
        System.out.println("Numbers:" + Arrays.toString(numbers));
        System.out.println("Contains Duplicates?" + containsDuplicate(numbers));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static boolean containsDuplicate(int[] numbers){
        for (int i=0; i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if (numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

}
