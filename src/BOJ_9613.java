/* 20210208 GCD 합 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9613 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;
    public static int GCD(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
    public static void main(String[] args) throws Exception{
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String arr[] = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            long sum = 0;
             /*= new int[n];*/
            for (int j = 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    int a = Integer.parseInt(arr[j]);
                    int b = Integer.parseInt(arr[k]);
                    sum += GCD(a, b);
                }
            }
            bw.write(sum + "\n");
        }
        bw.close();
        br.close();
    }

}
