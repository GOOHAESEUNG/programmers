import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String[] arr2 = br.readLine().split(" ");

        for(int i = 0; i< N; i++){
            arr[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[N-1]);
    }
}