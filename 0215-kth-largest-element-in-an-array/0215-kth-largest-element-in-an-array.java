class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++) {
            // if(q.isEmpty() || nums[i] > q.peek()) {
            //     q.add(nums[i]);
            // }

            q.add(nums[i]);

            if(q.size() > k) {
                q.poll();
            }
        }

        return q.peek();
    }
}