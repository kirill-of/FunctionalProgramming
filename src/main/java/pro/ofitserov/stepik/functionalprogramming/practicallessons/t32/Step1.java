package pro.ofitserov.stepik.functionalprogramming.practicallessons.t32;

import java.util.function.Function;

/**
 * You have a curried function:
 * (arg1) -> (arg2) -> arg1 - arg2;
 * Select all possible types of its.
 */
public class Step1 {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> f1 = (arg1) -> (arg2) -> arg1 - arg2;
        Function<Double, Function<Double, Double>> f2 = (arg1) -> (arg2) -> arg1 - arg2;

//        Error
//        Function<Long, Function<Long, Function<Long, Long>>> f3 = (arg1) -> (arg2) -> arg1 - arg2;
//        Function<String, Function<String, String>> f4 = (arg1) -> (arg2) -> arg1 - arg2;
    }
}
