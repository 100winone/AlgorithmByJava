import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9012 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
//            bw.write("chchch");
//            System.out.println("ddd");
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                int cnt = 0;
                boolean check = true;
//                bw.write("CHECK1");
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j) == '('){
                        ++cnt;
                    } else if(str.charAt(j) == ')'){
                        --cnt;
                        if(cnt < 0) {
                            check = false;
                            break;
                        }
                    }
                }
                if (check && cnt == 0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
