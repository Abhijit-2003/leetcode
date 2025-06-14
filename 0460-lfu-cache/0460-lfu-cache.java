class LFUCache {

    // Key-value mapping
    private Map<Integer, Integer> keyToVal;
    // Key-frequency mapping
    private Map<Integer, Integer> keyToFreq;
    // Frequency to keys mapping (LinkedHashSet for LRU order within same frequency)
    private Map<Integer, LinkedHashSet<Integer>> freqToKeys;
    // Track minimum frequency
    private int minFreq;
    // Cache capacity
    private int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        this.minFreq = 0;
    }
    
    public int get(int key) {
        if (!keyToVal.containsKey(key)) return -1;

        // Get the current frequency
        int freq = keyToFreq.get(key);

        // Remove the key from the old frequency set
        freqToKeys.get(freq).remove(key);

        // If no keys with this frequency, update minFreq
        if (freqToKeys.get(freq).isEmpty() && freq == minFreq) {
            minFreq++;
        }

        // Update frequency for the key
        keyToFreq.put(key, freq + 1);

        // Add the key to the new frequency set
        freqToKeys.computeIfAbsent(freq + 1, x -> new LinkedHashSet<>()).add(key);

        return keyToVal.get(key);
    }
    
    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyToVal.containsKey(key)) {
            // If key exists, just update the value and its frequency
            keyToVal.put(key, value);
            get(key); // Update the frequency by calling get
            return;
        }

        // If cache is at capacity, evict the least frequent key
        if (keyToVal.size() >= capacity) {
            // Evict the least frequent key (minFreq)
            LinkedHashSet<Integer> leastFreqKeys = freqToKeys.get(minFreq);
            Integer evictKey = leastFreqKeys.iterator().next(); // get the LRU key
            leastFreqKeys.remove(evictKey);
            keyToVal.remove(evictKey);
            keyToFreq.remove(evictKey);
        }

        // Add new key-value pair
        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.computeIfAbsent(1, x -> new LinkedHashSet<>()).add(key);

        // Reset the minFreq to 1 when adding new keys
        minFreq = 1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */