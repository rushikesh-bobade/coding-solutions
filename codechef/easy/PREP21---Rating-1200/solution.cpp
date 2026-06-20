import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            String s = sc.next();

            Stack<Integer> stack = new Stack<>();

            for (char ch : s.toCharArray()) {

                // operand
                if (ch >= '0' && ch <= '9') {
                    stack.push(ch - '0');
                }

                // operator
                else {

                    int b = stack.pop();
                    int a = stack.pop();

                    if (ch == '+') {
                        stack.push(a + b);
                    }
                    else if (ch == '-') {
                        stack.push(a - b);
                    }
                    else if (ch == '*') {
                        stack.push(a * b);
                    }
                }
            }

            System.out.println(stack.peek());
        }

        sc.close();
    }
}