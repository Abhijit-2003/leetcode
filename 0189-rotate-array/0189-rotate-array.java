class Solution {
    public void reverse(int nums[], int start, int end) {
        while(end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        // int cy = 0;

        // for(int i = 0; i < nums.length; i++) {

        //     int prev = nums[cy];
        //     int curr = 0;
        //     int j = (cy + k) % nums.length;
        //     while(j != cy) {
        //         curr = nums[j];
        //         nums[j] = prev;
        //         prev = curr;

        //         j = (j + k) % nums.length;
        //         ++i;
        //     }

        //     nums[j] = prev;
        //     ++cy;
        // }

    }
}