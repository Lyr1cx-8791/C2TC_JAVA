public class StackLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        public static Node head;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

        public static void printList() {
            if (head == null) {
                return;
            }
            Node prev = head;
            Node cur = prev.next;
            System.out.print(prev.data);
            while (cur != null) {
                System.out.print(" -> " + cur.data);
                cur = cur.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        int x = Stack.pop();
        Stack.printList();
        System.out.println();
        System.out.println("Popped Element: " + x);
    }
}
