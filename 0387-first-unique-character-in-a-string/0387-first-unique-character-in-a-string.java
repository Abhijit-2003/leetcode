class Solution {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> map = new LinkedHashMap<>();

        // for(char ch : s.toCharArray()) {
        //     if(map.containsKey(ch)) {
        //         map.put(ch, map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }

        // Set<Character> keys = map.keySet();
        // for (char key : keys) {
        //     if(map.get(key) == 1) {
        //         return s.indexOf(key);
        //     }
        // }

        // return -1;


        int freq[] = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch : s.toCharArray()) {
            if(freq[ch - 'a'] == 1) return s.indexOf(ch);
        }

        return -1;
    }
}