import java.util.Stack;

public class StackUsingCollectionFramework {
//    static Stack<Integer> ns = new Stack<>();
    public static void pushBottom(int item, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int top = s.pop();
        pushBottom(item, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
//        pushBottom(60, s);
//        s.push(60);
    }
}
