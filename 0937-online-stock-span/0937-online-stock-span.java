class StockSpanner {
    List<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);

        int i = list.size()-1;
        int count = 0;

        while(i >= 0 && list.get(i) <= price) {
            count++;
            i--;
        }

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */