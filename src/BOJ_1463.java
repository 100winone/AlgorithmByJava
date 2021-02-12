/* 20210212 1로 만들기 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_1463 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int D[] = new int[1000001];
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(D, 0);
        for (int i = 2; i <= n; i++) {
            D[i] = D[i - 1] + 1;
            if(i % 2 == 0){
                if(D[i / 2] + 1 < D[i]){
                    D[i] = D[i / 2] + 1;
                }
            }
            if(i % 3 == 0){
                if(D[i / 3] + 1 < D[i]){
                    D[i] = D[i / 3] + 1;
                }
            }
        }
        bw.write(D[n] + "\n");
        bw.close();
        br.close();
    }
}
