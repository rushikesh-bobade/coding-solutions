import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int a = Integer.parseInt(s.substring(0, 2));  // DD or MM
            int b = Integer.parseInt(s.substring(3, 5));  // MM or DD

            boolean ddmm = b <= 12; // valid month in DD/MM
            boolean mmdd = a <= 12; // valid month in MM/DD

            if (ddmm && mmdd) {
                System.out.println("BOTH");
            } else if (ddmm) {
                System.out.println("DD/MM/YYYY");
            } else {
                System.out.println("MM/DD/YYYY");
            }
        }

        scanner.close();
    }
}