import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//과목 개수 받아오기
int N = Integer.parseInt(br.readLine());

//점수를 공백 기준으로 스트링 배열에 저장
String[] arr = br.readLine().split(" ");

//int 형 배열 선언
int[] arr2 = new int[N];

//최대값 점수
int max = 0;

//과목 점수 총합
int total = 0;

for(int i = 0; i < N; i++) {
    //스트링 형태의 점수를 인트형으로 치환
    arr2[i] = Integer.parseInt(arr[i]);

    //최댓값 구하기
    if(arr2[i] > max) {
        max = arr2[i];
    }

    //점수 총합 구하기
    total += arr2[i];
}

    //점수 평균을 float형으로 구하기
    float A = (float) total /max*100/N;

    br.close();

    bw.write(String.valueOf(A));
    bw.flush();


    }
}