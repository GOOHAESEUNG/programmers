import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M =0;

        int result = 0;

        for(int i = 1; i< N; i++){
            M = i;
            String str = Integer.toString(i);

            int sum = M;

            for(int j = 0; j < str.length(); j++){
                sum += str.charAt(j) - '0';
            }

            if(sum == N){
                result = M;
                break;
            }
        }


        System.out.println(result);
    }
}