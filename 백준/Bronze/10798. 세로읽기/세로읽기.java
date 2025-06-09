import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Character[][] arr = new Character[5][15];

        String[] Line = new String[5];

        for(int i = 0; i < 5; i++) {
            Line[i] = br.readLine();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < Line[i].length(); j++) {
                arr[i][j] = Line[i].charAt(j);
            }
        }


        StringBuffer sb = new StringBuffer();

        for(int a = 0; a < 15; a++) {
            for(int b = 0; b < 5; b++) {
                if(arr[b][a] != null) {
                    sb.append(arr[b][a]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}