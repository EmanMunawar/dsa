import java.util.Arrays;

public class FindClosestNumberToZeroOptimal {
    public static void main(String[] args) {
        int[] number = {1, 98, 5, -1, 7, 2, 4, 3};
        System.out.println("Array in which we have to find Number closest to Zero = " + Arrays.toString(number));
        System.out.println("Closest Number To Zero = " + findClosestNumber(number));
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }

    public static int findClosestNumber(int[] number) {

        int closest = number[0];

        // Traverse the array only once
        for (int num : number) {

            if (Math.abs(num) < Math.abs(closest)) {  // Update if current number is closer to zero
                closest = num;
            }
            else if (Math.abs(num) == Math.abs(closest) && num > closest) { // If both are equally close, choose the positive number
                closest = num;
            }
        }
        return closest;
    }
}