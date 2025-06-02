import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");

            switch (split[0]) {
                case "1":
                    queue.addFirst(Integer.parseInt(split[1]));
                    break;
                case "2":
                    queue.addLast(Integer.parseInt(split[1]));
                    break;
                case "3":
                    sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append("\n");
                    break;
                case "4":
                    sb.append(queue.isEmpty() ? -1 : queue.pollLast()).append("\n");
                    break;
                case "5":
                    sb.append(queue.size()).append("\n");
                    break;
                case "6":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    break;
                case "8":
                    sb.append((queue.isEmpty() ? -1 : queue.peekLast())).append("\n");
                    break;
            }
        }

        System.out.print(sb); // 🔥 한 번만 출력
    }
}