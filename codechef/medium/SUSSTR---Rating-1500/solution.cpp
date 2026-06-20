import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            Deque<Character> ans = new ArrayDeque<>();

            int l = 0;
            int r = n - 1;

            boolean alice = true;

            while (l <= r) {

                if (alice) {
                    // Alice takes from left
                    char ch = s.charAt(l++);

                    if (ch == '0')
                        ans.addFirst(ch);
                    else
                        ans.addLast(ch);

                } else {
                    // Bob takes from right
                    char ch = s.charAt(r--);

                    if (ch == '1')
                        ans.addFirst(ch);
                    else
                        ans.addLast(ch);
                }

                alice = !alice;
            }

            StringBuilder res = new StringBuilder();

            for (char c : ans)
                res.append(c);

            System.out.println(res);
        }

        sc.close();
    }
}