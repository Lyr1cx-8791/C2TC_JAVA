public class Recursion {
    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    static void printNum(int n, int range) {
        if (n == range + 1)
            return;
        System.out.println(n);
        printNum(n + 1, range);
    }

    static void printNumRev(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumRev(n - 1);
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println("Printing numbers from 1 to 5");
//        printNum(1, 5);
//        System.out.println("Printing numbers from 5 to 1");
//        printNumRev(5);

    }
}
