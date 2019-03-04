package pro.ofitserov.stepik.functionalprogramming.practicallessons.t17;

import java.util.stream.LongStream;

public class Step {

    /**
     * 2.17 Checking if a number is prime
     * Write a method using Stream API to check the input number is prime or not. Let's agree that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....). Use the provided template for your method.
     * A prime number is a value greater than 1 that has no positive divisors other than 1 and itself. See https://en.wikipedia.org/wiki/Prime_number
     * Important. This problem has a simple and clear solution with streams. Please, do not use cycles.
     * <p>
     * Sample Input 1:
     * 2
     * Sample Output 1:
     * True
     * <p>
     * Sample Input 2:
     * 3
     * Sample Output 2:
     * True
     * Sample Input 3:
     * 4
     * Sample Output 3:
     * False
     */

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    public static boolean isPrime(final long number) {
        // write your code here

        //return LongStream.range(2, number / 2 + 1).noneMatch(i -> number % i == 0);

        //return LongStream.rangeClosed(2, number).filter(i -> number % i == 0).count() == 1;

        return LongStream.range(2, number).noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(14));
        //false
        System.out.println(isPrime(13));
        //true
        System.out.println(isPrime(7));
        //true
    }
}
