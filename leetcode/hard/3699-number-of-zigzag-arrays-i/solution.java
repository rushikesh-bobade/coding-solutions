class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // length = 2
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < m; b++) {
                if (a < b) {
                    up[b]++;
                } else if (a > b) {
                    down[b]++;
                }
            }
        }

        // build lengths 3..n
        for (int len = 3; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long[] prefDown = new long[m];
            prefDown[0] = down[0];

            for (int i = 1; i < m; i++) {
                prefDown[i] = (prefDown[i - 1] + down[i]) % MOD;
            }

            long[] suffUp = new long[m];
            suffUp[m - 1] = up[m - 1];

            for (int i = m - 2; i >= 0; i--) {
                suffUp[i] = (suffUp[i + 1] + up[i]) % MOD;
            }

            for (int v = 0; v < m; v++) {

                // previous value smaller
                if (v > 0) {
                    newUp[v] = prefDown[v - 1];
                }

                // previous value larger
                if (v + 1 < m) {
                    newDown[v] = suffUp[v + 1];
                }
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        if (n == 2) {
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }

        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}