package pro.ofitserov.stepik.functionalprogramming.practicallessons.t6;

import java.util.function.DoubleUnaryOperator;

public class Step1 {

    /**
     * 2.6 Writing closures
     * Using closure write a lambda expression that calculates a∗x2+b∗x+c where a, b, c are context final variables. They will be available in the context during testing. Note, the result is double.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * Examples: (x, y) -> x + y; (x, y) -> { return x + y; }
     */

    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        DoubleUnaryOperator doubleUnaryOperator = x -> a * x * x + b * x + c;

        System.out.println(doubleUnaryOperator.applyAsDouble(1));
    }
}

