import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //상근이 시간 입력 받기
        String[] tokens = br.readLine().split(" ");

        int H = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);

        int RM = M -45;

        //창영이 시간으로 변경(-45분)
        if(RM < 0){
            //M이 0일 경우 10-45 = -35 60-35
            // 만약 음수일 경우 60에서 빼기 그리고 h도 -1?
            M = 60 + RM;
            H =H-1;

            if(H < 0){
                H = 24 + H;
            }
        } else if (RM == 0) {
            M = 0;
        } else {
            M = RM;
        }



        System.out.println(H + " " + M);
    }
}