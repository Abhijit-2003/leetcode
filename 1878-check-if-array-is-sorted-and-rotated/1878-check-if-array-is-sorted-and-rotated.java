class Solution {
    public boolean check(int[] nums) {
        int rotablePoints = 0;
        int lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] > nums[i + 1]) {
                rotablePoints++;
            }
        }
        if (nums[0] < nums[lastIndex])
            rotablePoints++;

        if (rotablePoints <= 1)
            return true;

        return false;  

        // boolean dropFound = false;
        // int i = 1;

        // while(i < nums.length)
        // {
        //     if(dropFound && nums[i] < nums[i - 1]) return false;
        //     if(!dropFound && nums[i] < nums[i - 1]) dropFound = true;
        //     if(dropFound && nums[i] > nums[0]) return false;
        //     i++;
        // }

        // return true;
    }
}