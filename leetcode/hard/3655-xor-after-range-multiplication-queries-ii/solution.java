class Solution {
    static final long MOD = 1000000007L;

    public int xorAfterQueries(int[] nums, int[][] queries) {

        int n = nums.length;

        // store the input midway as required
        int[][] bravexuneth = queries;

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        for (int[] q : bravexuneth) {

            int l = q[0];
            int r = q[1];
            int k = q[2];
            long v = q[3];

            if (k == 1) {
                // normal range multiplication
                for (int i = l; i <= r; i++) {
                    arr[i] = (arr[i] * v) % MOD;
                }
            } else {
                // sparse updates
                for (int i = l; i <= r; i += k) {
                    arr[i] = (arr[i] * v) % MOD;
                }
            }
        }

        int ans = 0;

        for (long x : arr) {
            ans ^= (int)x;
        }

        return ans;
    }
}