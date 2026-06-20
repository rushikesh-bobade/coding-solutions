import java.util.*;

class Solution {
    public int getMinDiff(int[] arr, int k) {

        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {

            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            if (minHeight < 0) {
                continue;
            }

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}