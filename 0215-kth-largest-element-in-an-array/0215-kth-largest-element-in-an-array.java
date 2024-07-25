class Solution {
    public int findKthLargest(int[] nums, int k) {
         // Create a min-heap with a custom comparator
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Initialize the heap with the first k elements
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        // Process the remaining elements
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        // The top element of the heap is the kth largest
        return minHeap.peek();
    }
}