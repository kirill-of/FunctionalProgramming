package pro.ofitserov.stepik.functionalprogramming.practicallessons.t32;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * You know a type of a function
 * BiFunction<Integer, Integer, BiFunction<Integer, Integer, Function<Integer, Integer>>>
 * Select all suitable lambda expressions.
 */
public class Step2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, BiFunction<Integer, Integer, Function<Integer, Integer>>> f;
        f = (Integer arg1, Integer arg2) -> (arg3, arg4) -> (arg5) -> arg1 + arg2 + arg3 + arg4 + arg5;
        f = (arg1, arg2) -> (arg3, arg4) -> (arg5) -> arg1 + arg2 + arg3 + arg4 + arg5;
        f = (arg1, arg2) -> (arg3, arg4) -> (arg5) -> arg1;

//        Errors
//        f = (arg1) -> (arg2, arg3) -> (arg4, arg5) -> arg5;
//        f = (arg1) -> (arg2, arg3) -> (arg4, arg5) -> arg1 + arg2 + arg3 + arg4 + arg5;
//        f = (arg1, arg2) -> (arg3, arg4) -> (String arg5) -> arg1;
    }
}
