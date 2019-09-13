

import java.math.BigInteger;


public class Factorial {

    public static void main(String[] args) {
        int n = 100;
        BigInteger val = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            val = val.multiply(BigInteger.valueOf(i));
            int dSum = digitsSum(val);
            System.out.println(i + " : " + dSum);
        }
    }


    private static int digitsSum(BigInteger val) {
        String chars = val.toString();
        int digitsSum = 0;
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            digitsSum += Integer.parseInt(String.valueOf(c));
        }
        return digitsSum;
    }

}


