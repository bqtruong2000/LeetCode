class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int[] temp = new int[(n+1)*(n+1)];
        int tempCount = 0;
        int left = 0, right = n;
        while(left <= right) {
            for(int col = n; col >= 0; col--) {
                temp[tempCount] = (matrix[col][left]);
                tempCount++;
            }
            left++;
        }
        tempCount = 0; // Reset tempCount to start from the beginning of temp array
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                matrix[row][col] = temp[tempCount];
                tempCount++;
            }
        }
    }
}