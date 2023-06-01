package JavaAssinment2;

public class Question4 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                // Check if the current plot and its adjacent plots are empty
                boolean canPlant = (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0);
                if (canPlant) {
                    flowerbed[i] = 1; // Plant a flower
                    count++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        Question4 solution = new Question4();
        boolean result = solution.canPlaceFlowers(flowerbed, n);

        System.out.println("Output: " + result);
    }
}

