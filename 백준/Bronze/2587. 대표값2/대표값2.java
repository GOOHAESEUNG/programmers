import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            sum += arr[i];
        }

        Arrays.sort(arr); // 오름차순 정렬

        System.out.println(sum/5);
        System.out.println(arr[arr.length/2]);

    }
}