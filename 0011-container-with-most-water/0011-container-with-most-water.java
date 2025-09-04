class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        
        int area = 0;

        while(left <= right) {
            int tempArea = (right - left) * Math.min(height[left], height[right]);

            area = Math.max(area, tempArea);

            if(height[left] > height[right]) {
                right--;
            } else {
                left ++;
            }
        }

        return area;
    }
}