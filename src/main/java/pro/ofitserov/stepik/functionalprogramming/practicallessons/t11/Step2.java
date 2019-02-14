package pro.ofitserov.stepik.functionalprogramming.practicallessons.t11;

import java.util.function.Consumer;

public class Step2 {
    /**
     2.11 Understanding of the function composition
     You have the following part of a code:

     Consumer<Integer> printer = System.out::println;
     Consumer<Integer> devNull = (val) -> { int v = val * 2; };

     Consumer<Integer> combinedConsumer = devNull.andThen(devNull.andThen(printer));
     combinedConsumer.accept(100);

     What does this code print?
     */

    public static void main(String[] args) {
        Consumer<Integer> printer = System.out::println;
        Consumer<Integer> devNull = (val) -> { int v = val * 2; };

        Consumer<Integer> combinedConsumer = devNull.andThen(devNull.andThen(printer));
        combinedConsumer.accept(100);

        //100
    }
}
