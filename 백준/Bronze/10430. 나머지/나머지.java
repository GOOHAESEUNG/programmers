import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        int C = Integer.parseInt(tokens[2]);


        StringBuffer sb = new StringBuffer();

        sb.append((A + B) % C).append("\n");
        sb.append(((A % C) + (B % C)) % C).append("\n");
        sb.append((A * B) % C).append("\n");
        sb.append(((A % C) * (B % C)) % C).append("\n");

        System.out.println(sb);

    }
}