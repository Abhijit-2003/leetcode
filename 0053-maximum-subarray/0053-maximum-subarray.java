class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // extend or restart
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // update max
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}