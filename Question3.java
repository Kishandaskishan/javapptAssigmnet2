package JavaAssinment2;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int longestSubsequence = 0;
        
        // Check for pairs with difference 1 and update the length of the longest harmonious subsequence
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentLength = countMap.get(num) + countMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentLength);
            }
        }
        
        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        Question3 solution = new Question3();
        int result = solution.findLHS(nums);

        System.out.println("Output: " + result);
    }
}

