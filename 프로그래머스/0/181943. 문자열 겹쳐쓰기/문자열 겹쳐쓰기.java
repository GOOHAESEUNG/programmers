import java.util.Scanner;


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder();

        // 1. 첫 번째 루프: 덮어쓰기 전의 문자열 부분 복사
        for (int i = 0; i < s; i++) {
            result.append(my_string.charAt(i));
        }

        // 2. 두 번째 루프: 덮어쓰는 부분 추가
        for (int i = 0; i < overwrite_string.length(); i++) {
            result.append(overwrite_string.charAt(i));
        }

        // 3. 세 번째 루프: 덮어쓴 이후의 나머지 문자열 추가
        for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            result.append(my_string.charAt(i));
        }

        return result.toString(); // 최종 문자열 반환
    }
}
