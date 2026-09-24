class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count frequency of each number
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a min heap
        // The element with the smallest frequency stays at the top
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> freq.get(a) - freq.get(b)
        );

        // Step 3: Add every unique number to the heap
        for (int num : freq.keySet()) {

            minHeap.offer(num);

            // Keep only k elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Store the k most frequent elements
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
