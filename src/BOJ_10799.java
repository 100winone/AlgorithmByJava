/* 20210120 쇠막대기 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_10799 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        String pipe = br.readLine();
        int n = pipe.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pipe.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                if (i - stack.pop() == 1)
                    count += stack.size();
                else count += 1;
            }
        }
        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
