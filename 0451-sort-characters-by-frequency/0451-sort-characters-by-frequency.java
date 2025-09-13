class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        StringBuilder ans = new StringBuilder();

        // while(!map.isEmpty()) {
        //     char maxChar = 0;
        //     int maxValue = 0;

        //     for(char c : map.keySet()) {
        //         if(map.get(c) > maxValue) {
        //             maxChar = c;
        //             maxValue = map.get(c);
        //         }
        //     }

        //     for(int i=0; i<maxValue; i++) {
        //         ans.append(maxChar);
        //     }

        //     map.remove(maxChar);
        // }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        maxHeap.addAll(map.entrySet());

        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();

            for(int i=0; i<entry.getValue(); i++) {
                ans.append(entry.getKey());
            }
        }

        return ans.toString();
    }
}