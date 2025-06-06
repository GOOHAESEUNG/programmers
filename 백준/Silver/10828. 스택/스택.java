import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");

            switch (split[0]) {
                case "push":
                    stack.push(Integer.parseInt(split[1]));
                    break;
                case "pop":
                    if (stack.isEmpty()){
                        System.out.println(-1);
                    }else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()){
                        System.out.println(1);
                    }
                    else
                        System.out.println(0);
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);  // 또는 원하는 기본값
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;

            }
        }
    }
}