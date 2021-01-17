import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_1874 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int arr[];
    public static void main(String[] args) throws Exception {
        int n;
        int index = 1;
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            arrayList.add("+");
            while (!stack.empty() && arr[index] == stack.peek()) {
                stack.pop();
                index++;
                arrayList.add("-");
            }
        }
        if (stack.empty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                bw.write(arrayList.get(i) + "\n");
            }
        } else {
            bw.write("NO\n");
        }
        br.close();
        bw.close();
    }
}
