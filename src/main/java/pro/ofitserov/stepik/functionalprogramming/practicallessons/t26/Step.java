package pro.ofitserov.stepik.functionalprogramming.practicallessons.t26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 2.26 Collectors in practice: the product of squares
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 * <p>
 * List<Integer> numbers = ...
 * long val = numbers.stream().collect(...your_collector_will_be_passed_here...);
 * <p>
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...).
 * <p>
 * Sample Input 1:
 * 0 1 2 3
 * Sample Output 1:
 * 0
 * <p>
 * Sample Input 2:
 * 1 2
 * Sample Output 2:
 * 4
 */
public class Step {
    public static void main(String[] args) {
        Collector collector = Collectors.reducing(1, (a, b) -> a * b * b);

        List<Integer> numbers1 = Arrays.asList(0, 1, 2, 3);
        System.out.println(numbers1.stream().collect(collector));

        List<Integer> numbers2 = Arrays.asList(1, 2);
        System.out.println(numbers2.stream().collect(collector));
    }
}
