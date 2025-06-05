class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 1;
        int j = arr.length-2;

        while(i <= j) {
            int mid = i + (j-i) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if(arr[mid] < arr[mid - 1]) {
                j = mid-1;
            } else {
                i = mid+1;
            }
        }

        return -1;
    }
}