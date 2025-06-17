class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }




        // int i = nums1.length-1;
        // m = m-1;
        // n = n-1;

        // while(i >= 0 && n >= 0) {
        //     if(m >= 0 && nums1[m] > nums2[n]) {
        //         int temp = nums1[m];
        //         nums1[m] = nums1[i];
        //         nums1[i] = temp;

        //         m--;
        //     } else {
        //         nums1[i] = nums2[n];
        //         n--;
        //     }
        //     i--;
        // }
    }
}