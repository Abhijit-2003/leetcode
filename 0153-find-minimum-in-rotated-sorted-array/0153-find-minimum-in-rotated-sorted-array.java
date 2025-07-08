class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        int min = Integer.MAX_VALUE;

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            min = Math.min(nums[m], min);
            if (nums[m] <= nums[h]) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return min;
    }
}