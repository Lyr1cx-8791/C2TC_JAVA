public class Backtracking {
    static int factorial(int x) {
        if (x == 1 || x == 0 || x < 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static int combination(int n, int r) {
        return factorial(n) / factorial(n - r) * factorial(r);
    }

    public static void printPermutation(String str, String perm) {
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "");
    }
}
