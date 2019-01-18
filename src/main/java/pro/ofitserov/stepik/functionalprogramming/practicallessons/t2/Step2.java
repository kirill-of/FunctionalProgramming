package pro.ofitserov.stepik.functionalprogramming.practicallessons.t2;

import java.util.function.LongFunction;

public class Step2 {

    /**
     * Write a lambda expression that accepts a long value and returns a next even number.
     * It is guaranteed an input number is non-negative.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * Examples: x -> x; (x) -> x; (x) -> { return x; };
     * Sample Input 1:
     * 2
     * Sample Output 1:
     * 4
     * Sample Input 2:
     * 317
     * Sample Output 2:
     * 318
     */

    public static void main(String[] args) {
        LongFunction<Long> nextEvenNumber = x -> x % 2 == 0 ? x + 2 : ++x;

        System.out.println(nextEvenNumber.apply(2));

        System.out.println(nextEvenNumber.apply(317));
    }
}
