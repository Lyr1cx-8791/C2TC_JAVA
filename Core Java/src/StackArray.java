public class StackArray {
    static int top = -1;
    static void push(int[] arr, int item){
        if(top >= arr.length){
            System.out.println("Stack overflow!");
        }
        arr[++top] = item;
    }
    static int pop(int[] arr){
        if(top == -1){
            System.out.println("Stack underflow!");
        }
        if(top >= arr.length){
            System.out.println("Stack overflow!");
        }
        return arr[top--];
    }
    public static void main(String[] args) {

        int[] arr = new int[10];
        int rem;
        push(arr, 10);
        push(arr, 20);
        push(arr, 30);
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rem = pop(arr);
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("popped element " + rem);
        rem = pop(arr);
        System.out.println();
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("popped element " + rem);
    }
}
