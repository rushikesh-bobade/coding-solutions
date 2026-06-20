import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        while (T-- > 0) {
            int N = sc.nextInt();

            ArrayDeque<Long> dq = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                dq.addLast(sc.nextLong());
            }

            int player = 1; // 1 = Aman, 0 = Akshat

            while (dq.size() > 1) {
                if (player == 1) {
                    // Aman: move 1 once
                    dq.addLast(dq.removeFirst());

                    // move 2 once
                    dq.removeFirst();
                } else {
                    // Akshat: move 1 twice
                    dq.addLast(dq.removeFirst());
                    dq.addLast(dq.removeFirst());

                    // move 2 once
                    dq.removeFirst();
                }

                player = 1 - player;
            }

            // The last player to make a removal is the opposite of the next turn
            int lastPlayer = 1 - player;

            ans.append(lastPlayer)
               .append(" ")
               .append(dq.peekFirst())
               .append("\n");
        }

        System.out.print(ans);
    }
}