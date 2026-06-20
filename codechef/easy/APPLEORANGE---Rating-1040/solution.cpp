import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();

            System.out.println(gcd(N, M));
        }

        sc.close();
    }
}