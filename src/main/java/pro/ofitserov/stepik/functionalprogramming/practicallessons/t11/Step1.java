package pro.ofitserov.stepik.functionalprogramming.practicallessons.t11;

import java.util.function.IntUnaryOperator;

public class Step1 {
    /**
     2.11 Understanding of the function composition
     You have the following part of a code:

     IntUnaryOperator mult2 = num -> num * 2;
     IntUnaryOperator add3 = num -> num + 3;

     IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);
     int result = combinedOperator.applyAsInt(5);
     The result is ...
     */

    public static void main(String[] args) {
        IntUnaryOperator mult2 = num -> num * 2;
        IntUnaryOperator add3 = num -> num + 3;

        IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);
        int result = combinedOperator.applyAsInt(5);

        /**
         The sequence of calculations for add3.compose(mult2.andThen(add3)).andThen(mult2) is:
         1 - mult2 (in internal brackets)
         2 - andThen(add3)
         3 - add3.compose(...)
         4 - andThen(mult2)
         i.e. ((5 * 2 + 3) + 3) * 2 = 32
         */

        System.out.println(result);
    }

}
