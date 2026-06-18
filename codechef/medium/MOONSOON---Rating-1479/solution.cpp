import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();

            long[] cars = new long[n];
            long[] outlets = new long[m];

            for (int i = 0; i < n; i++) {
                cars[i] = sc.nextLong();
            }

            for (int i = 0; i < m; i++) {
                outlets[i] = sc.nextLong() * (long) h;
            }

            Arrays.sort(cars);
            Arrays.sort(outlets);

            long ans = 0;

            int i = n - 1;
            int j = m - 1;

            while (i >= 0 && j >= 0) {
                ans += Math.min(cars[i], outlets[j]);
                i--;
                j--;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}