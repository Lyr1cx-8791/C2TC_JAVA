import java.util.*;
public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //push
        public static void push(int data){
            list.add(data);

        }

        //pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while(!Stack.list.isEmpty()){
            System.out.println(Stack.peek());
            int x = Stack.pop();
            System.out.println("Popped element " + x);
        }
    }
}
