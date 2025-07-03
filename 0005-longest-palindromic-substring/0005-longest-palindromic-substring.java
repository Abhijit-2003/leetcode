class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        String ans=s.substring(0,1);
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                ans=s.substring(i,i+2);
            }
        }
        for(int len=3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                if(s.charAt(i)==s.charAt(i+len-1)){
                    if(dp[i+1][i+len-2]==true){
                        dp[i][i+len-1]=true;
                        ans=s.substring(i,i+len);
                    }
                }
            }
        }
        return ans;
    }
}