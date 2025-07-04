class Solution {
    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count the frequency of characters in s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Count, s2Count)) return true;
            // Update the window
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the last window
        return matches(s1Count, s2Count);






        
        // first approch

        // if(s1.length() > s2.length()) return false;

        // char a1[] = s1.toCharArray();
        // Arrays.sort(a1);

        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<s1.length(); i++) {
        //     sb.append(s2.charAt(i));
        // }

        // for(int i=s1.length(); i<s2.length(); i++) {
        //     char a2[] = sb.toString().toCharArray();
        //     Arrays.sort(a2);

        //     if(Arrays.equals(a1, a2)) return true;

        //     sb.deleteCharAt(0);
        //     sb.append(s2.charAt(i));
        // }

        // char a2[] = sb.toString().toCharArray();
        // Arrays.sort(a2);

        // if(Arrays.equals(a1, a2)) return true;

        // return false;
    }
}