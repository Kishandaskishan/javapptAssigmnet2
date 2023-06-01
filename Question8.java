package JavaAssinment2;

import java.util.Arrays;

public class Question8 {
    public int minScore(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minScore = nums[n - 1] - nums[0];

        for (int i = 1; i < n; i++) {
            int min = Math.min(nums[0] + k, nums[i] - k);
            int max = Math.max(nums[n - 1] - k, nums[i - 1] + k);
            minScore = Math.min(minScore, max - min);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;

        Question8 solution = new Question8();
        int result = solution.minScore(nums, k);

        System.out.println("Output: " + result);
    }
}

