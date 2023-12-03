//import java.util.*;

import java.util.Arrays;

//Strings and String builder concepts
public class Strings {
    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        String lName = in.nextLine();
        //fName > lName +ve
        //fName < lName -ve
        //fName == lName 0
        if(fName.compareTo(lName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
*/
//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//        sb.insert(0, 'S');
//        sb.setCharAt(0, 'X');
//        sb.delete(2, 4);
//        sb.append("oly");
//        System.out.println(sb);
//        System.out.println(sb.length());
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int j = sb.length() - 1 - i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(j);

            sb.setCharAt(i, backChar);
            sb.setCharAt(j, frontChar);
        }
        System.out.println(sb);
    }
}
