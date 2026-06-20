import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {

            String s = br.readLine().trim();

            int balance = 0;
            int longest = 0;

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (ch == '<') {
                    balance++;
                } else {
                    balance--;
                }

                // too many closing brackets
                if (balance < 0) {
                    break;
                }

                // valid prefix found
                if (balance == 0) {
                    longest = i + 1;
                }
            }

            ans.append(longest).append('\n');
        }

        System.out.print(ans);
    }
}