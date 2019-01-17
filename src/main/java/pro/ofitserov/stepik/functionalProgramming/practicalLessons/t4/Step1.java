package pro.ofitserov.stepik.functionalProgramming.practicalLessons.t4;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class Step1 {

    /**
     * 2.4 Calculating production of all numbers in the range
     * Write a lambda expression that accepts two long arguments as a range borders and calculates (returns) production of all numbers in this range (inclusively). It's guaranteed that 0 <= left border <= right border. if left border == right border then the result is any border.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * Examples: (x, y) -> x + y; (x, y) -> { return x + y; };
     * Sample Input 1:
     * 0 1
     * Sample Output 1:
     * 0
     * Sample Input 2:
     * 2 2
     * Sample Output 2:
     * 2
     * Sample Input 3:
     * 1 4
     * Sample Output 3:
     * 24
     * Sample Input 4:
     * 5 15
     * Sample Output 4:
     * 54486432000
     */

    public static void main(String[] args) {
        LongBinaryOperator rangeAndProduction = (x, y) -> LongStream.rangeClosed(x, y).reduce((p1, p2) -> p1 * p2).getAsLong();

        System.out.println(rangeAndProduction.applyAsLong(0, 1));
        System.out.println(rangeAndProduction.applyAsLong(2, 2));
        System.out.println(rangeAndProduction.applyAsLong(1, 4));
        System.out.println(rangeAndProduction.applyAsLong(5, 15));
    }
}
