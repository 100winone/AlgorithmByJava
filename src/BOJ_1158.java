/* 20210119 요세푸스 문제 Silver 5 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1158 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int K;
    private static Queue<Integer> seqNum = new LinkedList<>();
    private static Queue<Integer> ans = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        String str = br.readLine();
        String arr[] = str.split(" ");
        N = Integer.parseInt(arr[0]); // N명의 사람 수
        K = Integer.parseInt(arr[1]); // 주기
        /*Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();*/
        int period = 0;
        for (int i = 1; i <= N; i++) {
            seqNum.add(i);
        }
        while(ans.size() != N){
            ++period;
            if(period == K){
                ans.add(seqNum.poll());
                period = 0;
            } else {
                seqNum.add(seqNum.poll());
            }
        }
        bw.write("<");
        while (true) {
            if(ans.size() == 1) {
                bw.write(ans.poll() + ">");
                break;
            } else {
                bw.write(ans.poll() + ", ");
            }

        }
        br.close();
        bw.close();
    }
}
