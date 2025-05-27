 import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim(); // 앞뒤 공백 제거

        if (str.isEmpty()) {
            System.out.println(0); // 공백만 있을 경우
            return;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}