class Solution {
    public boolean isAlphNumeric(char ch) {
        return((ch >= 'a' && ch <= 'z') || 
        (ch >= 'A' && ch <= 'Z') ||
        ch >= '0' && ch <= '9');
    }
    public boolean isPalindrome(String s) {
        // if (s.isEmpty()) {
        // 	return true;
        // }

        // String s2 = s.toLowerCase();
        // String s3 = s2.replaceAll("[^a-zA-Z0-9]", "");

        // System.out.println(s3);

        // char arr[] = s3.toCharArray();

        // int j = arr.length - 1;
        // for(int i = 0; i < arr.length / 2; i++) {
        //     if(arr[i] != arr[j]) return false;
        //     j--;
        // }

        // return true;


        int i = 0;
        int j = s.length()  - 1;

        while(i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(!isAlphNumeric(ch1)) {
                i++;
                continue;
            }

            if(!isAlphNumeric(ch2)) {
                j--;
                continue;
            }

            if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) return false;

            i++;
            j--;
        }

        return true;
    }
}