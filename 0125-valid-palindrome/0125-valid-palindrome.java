class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }

        String s2 = s.toLowerCase();
        String s3 = s2.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s3);

        char arr[] = s3.toCharArray();

        int j = arr.length - 1;
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[j]) return false;
            j--;
        }

        return true;
    }
}