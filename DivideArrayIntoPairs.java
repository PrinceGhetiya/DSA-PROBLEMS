import java.util.HashMap;

class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        if (nums.length % 2 != 0) return false; 
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) 
        {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        for (int count : freqMap.values()) 
        {
            if (count % 2 != 0) return false;
        }

        return true;
    }

        public static void main(String[] args) 
        {
            Solution solution = new Solution();
            int[] nums = {3, 3, 2, 2, 5, 5, 7, 7}; 
            System.out.println(solution.divideArray(nums)); 
        }
}
