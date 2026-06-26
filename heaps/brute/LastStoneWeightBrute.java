import java.util.ArrayList;
import java.util.Arrays;

public class LastStoneWeightBrute {
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
    public static int lastStoneWeight(int[] stones){    // function to know last stone weight
        ArrayList<Integer> list = new ArrayList<>();
        for (int s:stones){     // array into arraylist
            list.add(s);
        }
        while(list.size()>1){   // continue until only 1 or 0 stone remains
            int large =0;
            int secondLarge = 0;
            for(int i=1;i<list.size();i++){ //largest
                if(list.get(i)>list.get(large)){
                    large = i;
                }
            }
            int first = list.remove(large);

            for(int i=1; i<list.size();i++){    //2nd largest
                if(list.get(i)>list.get(secondLarge)){
                    secondLarge = i;
                }
            }
            int second = list.remove(secondLarge);
            if(first != second){
                list.add(first-second);
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        return list.get(0);
    }
}
