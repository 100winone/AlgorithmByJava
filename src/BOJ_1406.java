/* 20210118 에디터 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_1406 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if(input.contains("P")){
                leftStack.push(input.charAt(2));
            } else if (input.contains("L")) {
                if(leftStack.empty()) continue;
                rightStack.push(leftStack.pop());
            } else if (input.contains("D")) {
                if(rightStack.empty()) continue;
                leftStack.push(rightStack.pop());
            } else if (input.contains("B")){
                if(leftStack.empty()) continue;
                leftStack.pop();
            }
        }
        while (!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.empty()) {
            bw.write(rightStack.pop());
        }
        bw.write("\n");
        br.close();
        bw.close();
    }
}
