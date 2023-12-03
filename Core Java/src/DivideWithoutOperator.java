public class DivideWithoutOperator {
    public static int DWO(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign;
        if(dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0){
            sign = 1;
        } else{
            sign = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        int subquot;
        while(dividend - divisor >=0){
            for (subquot = 0; dividend - (divisor << subquot << 1) >= 0; subquot++);
            quotient += 1 << subquot;
            dividend -= divisor << subquot;
        }
        return quotient * sign;

    }
    public static void main(String[] args) {
        System.out.println(DWO(2147483647, 1));
//        int dividend = 116;
//        int divisor = 3;
//        int subquot = 0;
//        for (subquot = 0; dividend - (divisor << subquot << 1) >= 0; subquot++){
//            System.out.println(divisor << subquot << 1);
//       }

    }
}
