package JavaAssinment2;

import java.util.Arrays;

public class Question5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        int product1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        int product2 = nums[0] * nums[1] * nums[length - 1];

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        Question5 solution = new Question5();
        int result = solution.maximumProduct(nums);

        System.out.println("Output: " + result);
    }
}
