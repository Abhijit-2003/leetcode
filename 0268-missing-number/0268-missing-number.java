class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            count += nums[i];
        }

        return (n * (n+1))/2 - count;
    }
}