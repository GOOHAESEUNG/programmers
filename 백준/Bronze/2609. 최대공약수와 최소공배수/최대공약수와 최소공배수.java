import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        if(a> b){
            System.out.println(gcd(a,b));
            System.out.println(a*b/gcd(a,b));
        }else{
            System.out.println(gcd(b,a));
            System.out.println(b*a/gcd(b,a));
        }


    }

    private static int gcd(int a, int b) {
        // 유클리드 호제법: a와 b의 최대공약수는 b와 a % b의 최대공약수

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}