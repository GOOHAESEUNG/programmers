import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 개미 수 입력
        String[] tokens = br.readLine().split(" ");
        int N1 = Integer.parseInt(tokens[0]);
        int N2 = Integer.parseInt(tokens[1]);

        // 두 줄 입력 (개미 그룹)
        String first = br.readLine();   // 첫 번째 그룹 (거꾸로 이동하므로 뒤집을 예정)
        String second = br.readLine();  // 두 번째 그룹

        // 뒤집기
        StringBuffer sb = new StringBuffer(first);
        first = sb.reverse().toString();

        String[] first2 = first.split("");
        String[] second2 = second.split("");

        // 시간 입력
        int T = Integer.parseInt(br.readLine());

        // 결과 배열 초기화
        int resultLength = N1 + N2;

        //개미 결과 값
        String[] results = new String[resultLength];

        //방향과 관련된 배열
        String[] direction = new String[resultLength];

        // 초기 상태: 앞에 first, 뒤에 second
        for(int i = 0; i < N1; i++) {
            results[i] = first2[i];
            direction[i] = "L";
        }
        for(int i = 0; i < N2; i++) {
            results[N1 + i] = second2[i];
            direction[N1 + i] = "R";
        }

        // TODO: T초 동안 시뮬레이션 로직 구현 필요 (현재는 미구현)
        for(int i = 0; i < T ; i++) {
            for(int j = 0; j < resultLength - 1; j++) {
                if (direction[j].equals("L") && direction[j + 1].equals("R")) {
                    String temp = results[j];
                    results[j] = results[j + 1];
                    results[j + 1] = temp;

                    String temp2 = direction[j];
                    direction[j] = direction[j + 1];
                    direction[j + 1] = temp2;

                        j++;

                }
            }
        }


        // 출력
        StringBuilder output = new StringBuilder();
        for (String s : results) {
            output.append(s);
        }
        System.out.println(output);
    }
}