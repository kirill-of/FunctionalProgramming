package pro.ofitserov.stepik.functionalprogramming.practicallessons.t33;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * Write a curried form of the function f(x,y,z)=x+y∗y+z∗z∗z using lambda expressions in Java 8 style. The result and x, y, z must be integer numbers.
 * Solution format. You may write the result in any valid formats but with ; on the end.
 * An example of a curried function: x -> y -> ...;
 * <p>
 * Sample Input 1:
 * 1 1 1
 * Sample Output 1:
 * 3
 * <p>
 * Sample Input 2:
 * 2 3 4
 * Sample Output 2:
 * 75
 */
public class Step1 {
    public static void main(String[] args) {

        Function<Integer, Function<Integer, Function<Integer, Integer>>> fff = x -> y -> z -> x + y * y + z * z * z;

        System.out.println(fff.apply(1).apply(1).apply(1));
        System.out.println(fff.apply(2).apply(3).apply(4));
    }

}
