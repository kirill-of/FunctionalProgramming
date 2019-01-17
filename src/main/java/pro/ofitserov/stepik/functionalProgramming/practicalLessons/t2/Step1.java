package pro.ofitserov.stepik.functionalProgramming.practicalLessons.t2;

import java.util.function.IntBinaryOperator;

public class Step1 {

    /**
     * 2.2 Writing simple lambda expressions
     * Write a lambda expression that accepts two integers arguments and returns max of them.
     * <p>
     * Try not to use the Math library.
     * <p>
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * <p>
     * Examples: (x, y) -> x + y; (x) -> { return x; };
     * <p>
     * Sample Input:
     * 1 4
     * Sample Output:
     * 4
     */

    public static void main(String[] args) {

        IntBinaryOperator max = (x, y) -> x > y ? x : y;

        System.out.println(max.applyAsInt(1, 4));
    }
}
