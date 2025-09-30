import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            //N*N 2차원 배열 완성
            int arr[][] = new int[N+1][N+1];
            int[][] sum = new int[N+1][N+1];

            //배열에 값 넣기
                for (int i = 1; i <= N; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 1; j <= N; j++) {
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for(int i = 1; i <= N; i++) {
                    for(int j = 1; j <= N; j++) {
                        sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i][j];
                    }
                }



            for(int i = 0; i <M ; i++) {
                st = new StringTokenizer(br.readLine());
                int X1 = Integer.parseInt(st.nextToken());
                int Y1 = Integer.parseInt(st.nextToken());
                int X2 = Integer.parseInt(st.nextToken());
                int Y2 = Integer.parseInt(st.nextToken());

                System.out.println(sum[X2][Y2]  - sum[X1 - 1][Y2] - sum[X2][Y1-1] +sum[X1 -1][Y1 -1]);
            }


        }
    }
}