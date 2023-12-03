import java.util.LinkedList;

public class LL {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

//    public void deleteFront() {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        head = head.next;
//    }

//    public void deleteLast() {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        if (head.next == null) {
//            head = null;
//        }
//
//        Node secondLast = head;
//        Node last = head.next;
//        while (last.next != null) {
//            last = last.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next = null;
//    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static int dltNthNode(Node head, int n) {
        int len = 1;
        if (head == null) {
            return len;
        }
        Node lp = head;
        while (lp.next != null) {
            len++;
            lp = lp.next;
        }
        Node prev = head;
        for (int i = 0; i < len - n; i++) {
            prev = head.next;
        }

        return len;
    }

    public static void main(String[] args) {
        int n = 2;
        LL list = new LL();
        list.addFront(3);
        list.addFront(2);
        list.addLast(4);
        list.addFront(1);
        list.printList();
        int y = dltNthNode(list.head, n);
        System.out.println(y);
//        list.head = list.reverseRecursive(list.head);
//        list.printList();
//        list.reverseIterate();
//        list.printList();
    }
}