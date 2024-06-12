class Solution {
    public int lastStoneWeight(int[] stones) {
         // Create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all stones to the max heap
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        // Keep smashing stones until there's only one left
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // Get the heaviest stone
            int x = maxHeap.poll(); // Get the second heaviest stone

            // If they are not equal, calculate the difference and add it back to the heap
            if (x != y) {
                maxHeap.offer(y - x);
            }
        }

        // If there's any stone left, return it, else return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}