package JavaAssinment2;

import java.util.Arrays;

public class Question1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        
        int sum = 0;
        
        // Pair the consecutive elements and sum the minimum values in each pair
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        Question1 solution = new Question1();
        int result = solution.arrayPairSum(nums);

        System.out.println("Output: " + result);
    }
}
