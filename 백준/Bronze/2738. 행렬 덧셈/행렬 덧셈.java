import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N =  Integer.parseInt(st.nextToken());
        int M =  Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for(int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write((A[i][j] + B[i][j]) + " ");
            }
            bw.newLine(); // 줄바꿈
        }

        bw.close();
    }
}