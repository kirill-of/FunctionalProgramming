package pro.ofitserov.stepik.functionalprogramming.practicallessons.t35;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

/**
 * 2.35 Custom integer reducer
 * Write three operators:
 * <p>
 * A reduce operator that accepts an initial value (seed) and a combiner function and then returns a new function that combines all values in the given integer range (inclusively) into one integer value (it's a simple form of reduction).
 * In terms of the reduce operator define a sum operator for summing integer values in the given range.
 * In terms of the reduce operator define a product operator for multiplying integer values in the given range.
 * Try not to use Stream API. Write the reducer yourself.
 * <p>
 * To simplify the problem all functions are declared, you need to finish their realization.
 * Look carefully at definition of each operator.
 * <p>
 * During testing all three operators will be tested. The left boundary <= the right boundary.
 * <p>
 * Example 1. Left boundary = 1, right boundary = 4.
 * sumOperator returns the result 10.
 * productOperator returns the result 24.
 * Example 2. Left boundary = 5, right boundary = 6.
 * sumOperator returns the result 11.
 * productOperator returns the result 30.
 * ﻿If the task is too hard for you, see theory lesson on currying, URL: https://stepik.org/lesson/35160/step/1?course=Java-Functional-programming&unit=14551
 */

public class Step {
    public static void main(String[] args) {
    }

    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
            (seed, combiner) ->
                    (l, r) -> {
                        int acc = seed;
                        for (int el = l; el <= r; el++) {
                            acc = combiner.applyAsInt(acc, el);
                        }
                        return acc;
                    };

    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator sumOperator = reduceIntOperator.apply(0, (x, y) -> x + y);

    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = reduceIntOperator.apply(1, (x, y) -> x * y);
}
