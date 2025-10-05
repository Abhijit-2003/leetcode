class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums1) {
            set.add(num);
        }

        int[] ans = new int[nums1.length];
        int count = 0;

        for(int num : nums2) {
            if(set.contains(num)) {
                set.remove(num);
                ans[count] = num;
                count++;
            }
        }

        return Arrays.copyOfRange(ans, 0, count);
    }
}