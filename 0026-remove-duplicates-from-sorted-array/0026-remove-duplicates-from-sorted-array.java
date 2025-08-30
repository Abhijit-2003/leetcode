class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[j-1] < nums[i]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }

        return j;
    }
}