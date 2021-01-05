import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10828 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
//            br.readLine(); // 정수 입력받은 후 '\n' 개행 없애주기위해!
            Stack stack = new Stack(num);
            for (int i = 0; i < num; i++) {
                StringTokenizer str = new StringTokenizer(br.readLine(), " ");
                String func = str.nextToken();
                if(func.equals("push")){
                    int pushNum = Integer.parseInt(str.nextToken()); // 뒤에숫자를 넘기기
                    stack.push(pushNum);
                } else if (func.equals("pop")) {
                    System.out.println(stack.pop());
                } else if (func.equals("size")) {
                    System.out.println(stack.size());
                } else if (func.equals("empty")) {
                    System.out.println(stack.empty());
                } else { // top
                    System.out.println(stack.top());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Stack{
    int array[];
    int top = -1;
    public Stack(int num) {
        array = new int[num];
    }
    public void push(int num){
        array[top + 1] = num;
        top++;
    }
    public int pop(){
        if(top == -1){
            return -1;
        }
        int res = array[top];
        top--;
        return res;
    }
    public int size(){
        return top + 1;
    }
    public int empty(){
        if(top == -1) return 1;
        return 0;
    }
    public int top(){
        if(top == -1) return -1;
        return array[top];
    }
}