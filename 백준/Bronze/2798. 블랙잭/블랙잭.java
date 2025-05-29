import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);

        String[] array2 = br.readLine().split(" ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(array2[i]);
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {  
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}