/* 20210202 팩토리얼 0의 개수 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1676 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i * 5 <= N; i *= 5) {
            ans += (N / (i * 5));
        }
        bw.write(ans + "\n");
        bw.close();
        br.close();
    }
}
