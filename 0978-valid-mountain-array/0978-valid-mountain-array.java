class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;


        int i = 1;
        while (i < arr.length && arr[i - 1] < arr[i]) {
            i++;
        }

        int j = i;
        while (j < arr.length && arr[j - 1] > arr[j]) {
            j++;
        }

        if (i == 1 || j - i == 0) {
            return false;
        }
        
        return j == arr.length;
    }
}