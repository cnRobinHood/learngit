/**
 * Created by sky on 2016/10/17.
 */

import java.math.BigInteger;

class Factorial {
    public static BigInteger result(int input) {
        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public static String subResult(int input, int start, int end) {
        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        String temp = sum.toString().substring(start, end);
        return temp;

    }
}
