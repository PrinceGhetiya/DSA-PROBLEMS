import java.util.Arrays;
class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : nums) { 
            if (num > 0) {
                positiveCount++; 
            } else if (num < 0) {
                negativeCount++; 
            }
        }

        int maxCount = Math.max(positiveCount, negativeCount);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Positive Count: " + positiveCount);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Maximum Count: " + maxCount);

        return maxCount; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-4, -2, -1, 0, 1, 2, 3, 5}; 

        int result = sol.maximumCount(nums); 
        System.out.println("Final Maximum Count: " + result);
    }
}
