import java.util.Arrays;

public class ContainerWithMostWaterBrute {
    public static void main(String[] args){
        int[] height = {1,3,5,7,9,2,4,6};
        System.out.println("Height:" + Arrays.toString(height));
        System.out.println("Maximum Water:" + maxArea(height));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static int maxArea(int[]height){
        int maxArea=0;
        for(int i=0;i< height.length;i++){
            for (int j=i+1;j<height.length;j++){
                int width =j-i;
                int minHeight= Math.min(height[i],height[j]);
                int area = width * minHeight;
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        return maxArea;

    }
}
