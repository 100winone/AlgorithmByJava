/* 20210128 골드바흐의 추측 Silver 1, 에라토스테네스의 체를 사용하여 구함 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_6588 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    final static int MAX = 1000000;
    private static Boolean arr[] = new Boolean[MAX + 1];

    public static void main(String[] args) throws Exception{
        Boolean flag = false;
        // 아스토레테네스의 체를 먼저 구해보자
        Arrays.fill(arr, false); // 지워지면 true로 바꾸기
        for (int i = 2; i <= MAX; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= MAX; j += i) {
                    arr[j] = true;
                }
            }
        }
        /* 여기까지 끝나면 소수인애들은 true로 바뀌어있을 것
        * n = a + b
        * a = n - b */
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            for (int i = 3; i <= n; i++) {
                if(!arr[n - i] && !arr[i]) { // 이중조건 체크 해주어야함..!!
                    int tmp = n - i;
                    bw.write(n + " = " + i + " + " + tmp + "\n");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                bw.write("Goldbach's conjecture is wrong.\n");
            }
        }
        bw.close();
        br.close();
    }
}
