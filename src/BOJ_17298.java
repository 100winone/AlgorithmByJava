/* 20210124 오큰수 Gold 4 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_17298 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Stack<Integer> stack = new Stack<>(); // Push 'Index Number'


    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        String strArr[] = br.readLine().split(" ");
        int arr[] = new int[n]; // strArr을 숫자로변환
        int nge[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (stack.empty()) {
                stack.push(i);
            } while(!stack.empty() && arr[stack.peek()] < arr[i]){
                nge[stack.pop()] = arr[i];
            }
            stack.push(i); // stack에 들어있는 index의 오큰수구하기
        }
        while(!stack.empty()){
            nge[stack.pop()] = -1; // 오큰수 찾지 못한 index -1로 초기화
        }
        for (int i = 0; i < n; i++) {
            bw.write(nge[i] +" ");
        }
        bw.write('\n');
        bw.close();
        br.close();
    }
}
