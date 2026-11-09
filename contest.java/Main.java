import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long[] results = new long[6];

        // Operators in order (op1, op2):
        results[0] = a + b - c;   // + then -
        results[1] = a - b + c;   // - then +
        results[2] = a + b * c;   // + then *
        results[3] = a * b + c;   // * then +
        results[4] = a - b * c;   // - then *
        results[5] = a * b - c;   // * then -

        boolean ok = false;
        for (long r : results) {
            if (r == d) {
                ok = true;
                break;
            }
        }
        System.out.println(ok ? "YES" : "NO");
    }
}