class Solution {
    public void reverseString(char[] s) {

        // int n = s.length;
        // for(int i = 0; i < n/2; i++) {
        //     char temp = s[i];
        //     s[i] = s[n-i-1];
        //     s[n-i-1] = temp;
        // }


        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}