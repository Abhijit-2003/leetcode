class Solution {

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public int[][] kClosest(int[][] points, int k) {

        // Brute solution

        // Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
        // return Arrays.copyOfRange(points, 0, k);

        // optimal solution

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(distance(b), distance(a)));

        for(int[] point : points) {
            pq.add(point);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];

        for(int i=0; i<k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}