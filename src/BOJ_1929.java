/* 20210127 소수 구하기 Silver 2, 에라토스테네스의 체를 사용하여 구함 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_1929 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int M, N;
    private static Boolean isChecked[] = new Boolean[1000001];
    public static void main(String[] args) throws Exception{
        Arrays.fill(isChecked, false); // boolean 초기화해주기
        String input[] = br.readLine().split(" ");
        isChecked[1] = true;
        M = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);
        /* 지워지면 true로 바꾸어줄 것 */
        for (int i = 2; i <= N; i++) {
            if(!isChecked[i]){
                for (int j = i * 2; j <= N; j += i) { // int의 overflow때문에 i * i보다 i * 2로 하는 것이 좋음
                    isChecked[j] = true;
                }
            }
        }
        for (int i = M; i <= N; i++) {
            if(!isChecked[i]) bw.write(i + " ");
        }
        bw.close();
        br.close();
    }
}
