import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]); // 신호등 개수
        int L = Integer.parseInt(tokens[1]); // 도로 길이

        int[][] signals = new int[N][3];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            signals[i][0] = Integer.parseInt(line[0]); // 위치
            signals[i][1] = Integer.parseInt(line[1]); // 빨간불 시간
            signals[i][2] = Integer.parseInt(line[2]); // 초록불 시간
        }

        int runTime = 0;
        int currentPos = 0;
        int signalIdx = 0;

        while (currentPos < L) {
            // 현재 위치에 신호등이 있음
            if (signalIdx < N && currentPos == signals[signalIdx][0]) {
                int red = signals[signalIdx][1];
                int green = signals[signalIdx][2];
                int cycle = red + green;
                int t = runTime % cycle;

                // 빨간불이면 기다려야 함
                if (t < red) {
                    runTime += (red - t); // 기다린 시간만큼 추가
                }

                signalIdx++; // 다음 신호등으로 이동
            }

            // 1초 전진
            currentPos++;
            runTime++;
        }

        System.out.println(runTime);
    }
}