/* 20210122 단어 뒤집기 2 Silver 3 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_17413 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Stack<Character> stack = new Stack<>();
    static void print() throws Exception{
        while (!stack.empty()) {
            bw.write(stack.pop());
        }
    }
    public static void main(String[] args) throws Exception{
        String str = br.readLine();
        boolean tag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                print();
                tag = true;
                bw.write(str.charAt(i));
            } else if(str.charAt(i) == '>'){
                tag = false;
                bw.write(str.charAt(i));
            } else if (tag) {
                bw.write(str.charAt(i));
            } else { // tag == false일 때
                if(str.charAt(i) == ' '){
                    print();
                    bw.write(' ');
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        print();
        bw.close();
        br.close();
    }
}