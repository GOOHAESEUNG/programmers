import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int N = Integer.parseInt(br.readLine());

String[] arr = br.readLine().split(" ");

int[] arr2 = new int[N];

int max = 0;

int total = 0;

for(int i = 0; i < N; i++) {
    arr2[i] = Integer.parseInt(arr[i]);

    if(arr2[i] > max) {
        max = arr2[i];
    }

    total += arr2[i];
}

float A = (float) total /max*100/N;

br.close();

        System.out.println(A);



    }
}