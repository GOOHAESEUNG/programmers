import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");

        // 숫자카드를 map의 key로 저장
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(s1[i], "1");
        }

        int M = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            // key로 존재하면 "1", 없으면 "0"
            if (map.containsKey(s2[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}