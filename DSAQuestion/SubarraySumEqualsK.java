package DSAQuestion;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store (prefix sum -> count of occurrences)
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // base case: sum=0 occurred once

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists in map
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Add/update prefixSum in the map
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    // Test the code
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, -1, 1, 1};
        int k = 2;
        System.out.println("Count of subarrays: " + subarraySum(nums, k)); // Output: 2
    }
}
