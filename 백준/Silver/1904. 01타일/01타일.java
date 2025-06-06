import java.io.*;
import java.util.Scanner;

public class Main {
    public static int dp(int n) {
        int[] dp = new int[n + 2]; // n == 1일 때도 안전하게

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(dp(N));
    }
}