package DSAQuestion;

import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap based on frequencies
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll(); // remove least frequent
            }
        }

        // Step 3: Extract top k elements
        int[] result = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll().getKey();
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
        // Output: [2, 1] or [1, 2]
    }
}
