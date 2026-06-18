import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {

            String pattern = sc.nextLine();

            try {

                Pattern.compile(pattern);

                System.out.println("Valid");

            } catch (PatternSyntaxException e) {

                System.out.println("Invalid");
            }
        }
    }
}
