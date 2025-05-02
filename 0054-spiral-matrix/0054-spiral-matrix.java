class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom =matrix.length-1;
        int right = matrix[0].length-1;

        int total = matrix.length * matrix[0].length;
        int count = 0;

        while(count < total) {

            for(int i=left; i<=right && count < total; i++) {
                list.add(matrix[top][i]);
                count++;
            }
            top++;
        
            for(int i=top; i<=bottom && count < total; i++) {
                list.add(matrix[i][right]);
                count++;
            }
            right--;

            for(int i=right; i>=left && count < total; i--) {
                list.add(matrix[bottom][i]);
                count++;
            }
            bottom--;

            for(int i=bottom; i>=top && count < total; i--) {
                list.add(matrix[i][left]);
                count++;
            }
            left++;

        }

        return list;
    }
}