import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i = 0;
        int count = 0;

        while (i < N - 1) {

            // If current pair is valid
            if (arr[i + 1] - arr[i] <= D) {
                count++;
                i += 2; // use both sticks
            } else {
                i++; // skip current stick
            }
        }

        System.out.println(count);
    }
}