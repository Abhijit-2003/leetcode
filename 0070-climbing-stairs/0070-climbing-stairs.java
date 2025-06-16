class Solution {
    public int helper(int n, int dp[]) {
        if(n == 1 || n == 2) return n;

        if(dp[n] > 0) return dp[n];

        int sum = helper(n-1, dp) + helper(n-2, dp);
        dp[n] = sum;

        return sum;
    }

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i=0; i<n; i++) dp[i] = 0;

        return helper(n, dp);
    }
}