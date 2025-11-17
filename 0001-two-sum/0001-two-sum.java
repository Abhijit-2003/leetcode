class Solution {
    public int[] twoSum(int[] nums, int target) {
         // Brute Force

        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) return new int[] {i, j};
        //     }
        // }

        // return new int[] {};

        // HashMap

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remain = (target - nums[i]);

            if(map.containsKey(remain)) return new int[] {map.get(remain), i};

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}