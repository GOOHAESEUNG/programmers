import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder("");


        for(int i =str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }

        if(str.contentEquals(sb.toString())){
            System.out.println(1);
        }else System.out.println(0);
    }
}