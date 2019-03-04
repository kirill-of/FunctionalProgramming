package pro.ofitserov.stepik.functionalprogramming.practicallessons.t21;

import java.util.stream.LongStream;

/**
 * 2.21 The sum of odd numbers
 * <p>
 * Write a method for calculating the sum of odd numbers in the given interval (inclusively) using Stream API.
 * <p>
 * Important. Use the provided template for your method. Pay attention to type of an argument and the returned value. Please, don't use cycles.
 * <p>
 * <p>
 * Sample Input 1:
 * 0 0
 * Sample Output 1:
 * 0
 * <p>
 * Sample Input 2:
 * 7 9
 * Sample Output 2:
 * 16
 * <p>
 * Sample Input 3:
 * 21 30
 * Sample Output 3:
 * 125
 */

public class Step {

    /**
     * The method calculates the sum of odd numbers in the given range
     *
     * @param start of a range, start >= 0
     * @param end   of a range (inclusive), end >= start
     * @return sum of odd numbers
     */
    public static long sumOfOddNumbersInRange(long start, long end) {
        // write your code here
        return LongStream.rangeClosed(start, end)
                .filter(i -> i % 2 != 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfOddNumbersInRange(0, 0));
        System.out.println(sumOfOddNumbersInRange(7, 9));
        System.out.println(sumOfOddNumbersInRange(21, 30));
    }
}
