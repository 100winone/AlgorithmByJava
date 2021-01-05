/* 20210105 단어 뒤집기 Bronze_1 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_9093 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = sc.nextInt();
//        sc.nextLine();
        Stack<Character> stack = new Stack<>();
        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                String array[] = str.split(" ");

                for (int j = 0; j < array.length; j++) {
                    for (int k = 0; k < array[j].length(); k++) {
                        stack.push(array[j].charAt(k));
                    }
                    while (!stack.isEmpty()) {
//                        System.out.print(stack.pop());
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                }
                bw.write("\n");
                bw.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return;
    }
}
