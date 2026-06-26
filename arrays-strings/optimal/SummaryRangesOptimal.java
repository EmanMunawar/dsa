import java.util.ArrayList;
import java.util.Arrays;

public class SummaryRangesOptimal {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,9,10};
        System.out.println("Array whose range is to find is:" + Arrays.toString(arr));
        System.out.println("Range of Array: " + summaryRanges(arr));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }

    public static ArrayList<String> summaryRanges(int[] number) {   // Function to find summary ranges
        ArrayList<String> result = new ArrayList<>();
        if (number.length == 0) { // Check if array is empty
            return result;

        }
        int start = number[0];
        for (int i = 1; i <= number.length; i++) { // Traverse the array once

            if (i == number.length || number[i] != number[i - 1] + 1) {

                if (start == number[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + number[i - 1]);
                }
                if (i < number.length) {  // Start a new range
                    start = number[i];

                }
            }
        }
        return result;

    }
}