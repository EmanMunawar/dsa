import java.util.Arrays;

public class BestTimeToBuyAndSellStockBrute {
    public static void main(String[] args){
        int [] prices = {101,100,200,400,600};
        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + maxProfit(prices));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n*n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for (int i =0; i<prices.length; i++){
            for(int j = i+1;j< prices.length;j++){
                int profit = prices[j]-prices[i];
                if (profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
