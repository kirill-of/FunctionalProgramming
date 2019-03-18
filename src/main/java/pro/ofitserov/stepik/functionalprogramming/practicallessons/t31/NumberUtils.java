package pro.ofitserov.stepik.functionalprogramming.practicallessons.t31;

import java.math.BigInteger;

public class NumberUtils {
    static boolean isPrime(long number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }
}
