/* 20210211 숨바꼭질 6 Silver 1 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_17087 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, S;
    private static int GCD(int a, int b) {
        if(b == 0) return a;
        else return GCD(b, a % b);
    }
    public static void main(String[] args) throws Exception{
        String[] input = br.readLine().split(" ");
        String[] secInput;
        int ans = 1000000001;
        N = Integer.parseInt(input[0]);
        S = Integer.parseInt(input[1]);
        secInput = br.readLine().split(" ");
        if(N == 1){
            ans = Math.abs(Integer.parseInt(secInput[0]) - S);
            bw.write(ans + "\n");
        }
        else {
            for (int i = 0; i < N - 1; i++) {
                int tmpGCD = 0;
                int a = Math.abs(Integer.parseInt(secInput[i]) - S);
                int b = Math.abs(Integer.parseInt(secInput[i + 1]) - S);
                tmpGCD = GCD(a, b);
                if(tmpGCD < ans) ans = tmpGCD;
            }
            bw.write(ans + "\n");
        }
        br.close();
        bw.close();
    }
}

