class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        char a1[] = s1.toCharArray();
        Arrays.sort(a1);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s1.length(); i++) {
            sb.append(s2.charAt(i));
        }

        for(int i=s1.length(); i<s2.length(); i++) {
            char a2[] = sb.toString().toCharArray();
            Arrays.sort(a2);

            if(Arrays.equals(a1, a2)) return true;

            sb.deleteCharAt(0);
            sb.append(s2.charAt(i));
        }

        char a2[] = sb.toString().toCharArray();
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)) return true;

        return false;
    }
}