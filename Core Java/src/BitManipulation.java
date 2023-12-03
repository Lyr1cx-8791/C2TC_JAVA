import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Get Bit
        int n = 5; // 0101
        int pos = 2;
//        int bitMask = 1 << pos;
//        if((bitMask & n) == 0){
//            System.out.println("Bit was zero");
//        }
//        else{
//            System.out.println("Bit was one");
//        }
        //Set Bit
//        int bitMask = 1 << pos;
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);
        //Clear Bit
//        int bitMask = 1 << pos;
//        int newNumber = ~(bitMask) & n;
//        System.out.println(newNumber);
        //Update bit
        System.out.println("Enter the operation to be performed: ");
        // If you want you can take input from the user for the position
        int oper = in.nextInt(); // oper = 1 : set, oper = 0 : clear
        if(oper == 1){
            int bitMask = 1 << pos;
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int bitMask = 1 << pos;
            int newNumber = ~(bitMask) & n;
            System.out.println(newNumber);
        }
    }
}
