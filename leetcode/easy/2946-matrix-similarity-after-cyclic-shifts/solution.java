class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        k %= n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int newPos;

                if (i % 2 == 0) {
                    // even row shifts left
                    newPos = (j + k) % n;
                } else {
                    // odd row shifts right
                    newPos = (j - k + n) % n;
                }

                if (mat[i][j] != mat[i][newPos]) {
                    return false;
                }
            }
        }

        return true;
    }
}