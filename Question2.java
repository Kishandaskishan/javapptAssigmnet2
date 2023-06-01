package JavaAssinment2;

import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;
        
        Set<Integer> uniqueCandies = new HashSet<>();
        
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};

        Question2 solution = new Question2();
        int result = solution.maxCandies(candyType);

        System.out.println("Output: " + result);
    }
}
