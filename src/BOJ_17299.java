/* 20210125 오등큰수 Gold 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_17299 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Stack<Integer> stack = new Stack<>();
    private static int arr[] = new int[1000001]; // 빈
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        String a[] = br.readLine().split(" "); // 입력값
        int ans[] = new int[n + 1]; // 정답 배열
//        Integer.parseInt(arr[i]);

        for (int i = 0; i < n; i++) {
            int tmpNum = Integer.parseInt(a[i]);
            arr[tmpNum]++; // arr 갯수 배열
        }
        stack.push(0);
        for (int i = 1; i < n; i++) {
            if(stack.empty()){
                stack.push(i);
            }
            while (!stack.empty() && arr[Integer.parseInt(a[i])] > arr[Integer.parseInt(a[stack.peek()])]) {
                ans[stack.pop()] = Integer.parseInt(a[i]);
            }
            stack.push(i);
        }
        while(!stack.empty()){
            ans[stack.pop()] = -1;
        }
        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(ans[i]) + ' ');
        }
        bw.write('\n');
        br.close();
        bw.close();
    }
}
