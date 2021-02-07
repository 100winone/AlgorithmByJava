import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2004 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static long N, M;

    public static void main(String[] args) throws Exception{
        String input[] = br.readLine().split(" ");
        long cntFive = 0;
        long cntTwo = 0;
        N = Long.parseLong(input[0]);
        M = Long.parseLong(input[1]);
        for (long i = 5; i <= N; i *= 5) {
            cntFive += (N / i);
        }
        for (long i = 5; i <= N - M; i *= 5) {
            cntFive -= ((N - M) / i);
        }
        for (long i = 5; i <= M; i *= 5) {
            cntFive -= (M / i);
        }
        for (long i = 2; i <= N; i *= 2) {
            cntTwo += (N / i);
        }
        for (long i = 2; i <= N - M; i *= 2) {
            cntTwo -= ((N - M) / i);
        }
        for (long i = 2; i <= M; i *= 2) {
            cntTwo -= (M / i);
        }
        bw.write(Long.toString(Math.min(cntFive, cntTwo)));
        bw.close();
        br.close();
    }
}
