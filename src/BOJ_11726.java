/* 20210212 2xn 타일링 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_11726 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int D[] = new int[1001];
    public static void main(String[] args) throws Exception{
        Arrays.fill(D, 0);
        D[0] = 1;
        D[1] = 1;
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= n; i++) {
            D[i] = D[i - 1] + D[i - 2];
            D[i] %= 10007; // 이 내부에서 나눠면서 계산 해주어야함, 그렇지 않으면 범위 초과
        }
        bw.write(D[n] + "\n");
        bw.close();
        br.close();
    }
}
