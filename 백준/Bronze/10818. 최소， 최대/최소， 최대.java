import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 숫자 개수
        String[] array = br.readLine().split(" "); // 문자열 배열로 입력 받기

        int max = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[0]);

        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(array[i]);
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println(min + " " + max);
    }
}