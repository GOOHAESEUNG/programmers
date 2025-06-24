import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int MAX = 1000000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] sigma = new long[MAX + 1];
        long[] prefix = new long[MAX + 1];

        // 약수의 합 미리 구하기
        for (int i = 1; i <= MAX; i++) { // 1000000
            for (int j = i; j <= MAX; j += i) { // +i를 함으로써 j는 i의 배수
                sigma[j] += i;
            }
        }

        // 누적합 구하기
        for (int i = 1; i <= MAX; i++) {
            prefix[i] = prefix[i - 1] + sigma[i];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(prefix[N]).append("\n");
        }

        System.out.print(sb);
    }
}