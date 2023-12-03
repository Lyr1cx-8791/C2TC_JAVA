import java.util.*;
public class DynamicNInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        int[] myArr = new int[s.length];
        int i = 0;
        for (String x: s){
            myArr[i] = Integer.parseInt(x);
            i++;
        }
        Arrays.sort(myArr);
        System.out.println("Sorted array is: ");
        for (int x: myArr){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Max element in the array is : " + Arrays.stream(myArr).max().stream().toArray()[0]);
    }
}
