import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");

            switch (split[1]) {
                case "enter":
                    set.add(split[0]);
                    break;
                case "leave":
                    set.remove(split[0]);
                    break;
            }
        }

        List<String> list = new ArrayList<>(set);

        list.sort(Collections.reverseOrder());

        for(String s : list) {
            System.out.println(s);
        }
    }
}