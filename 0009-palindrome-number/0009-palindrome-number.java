class Solution {
    public boolean isPalindrome(int x) {
        int newNum = 0;
        int data = x;

        while(x > 0) {
            int temp = x % 10;
            newNum = ((newNum * 10) + temp);

            x = x/10;
        }

        return data == newNum;
    }
}