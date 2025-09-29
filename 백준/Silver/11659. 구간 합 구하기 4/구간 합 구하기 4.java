import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            long[] s= new long[N+1];

            st = new StringTokenizer(br.readLine());

            for(int i=1; i<=N; i++) {
                    s[i] = s[i - 1] + Integer.parseInt(st.nextToken()) ;
            }

            for(int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                System.out.println(s[y] - s[x -1]);
            }
        }
    }
}