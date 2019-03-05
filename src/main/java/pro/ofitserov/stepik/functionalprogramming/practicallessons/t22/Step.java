package pro.ofitserov.stepik.functionalprogramming.practicallessons.t22;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 2.22 Understanding of flatMap together with stream creating
 */

public class Step {
    public static void main(String[] args) {

        //You have a list numbers:
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

        //What numbers does the list generated contain ?

        //a)
        //[1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5]
        List<Integer> generatedA = numbers.stream()
                .flatMap(n -> Stream.generate(() -> n).limit(n))
                .collect(Collectors.toList());

        System.out.println(generatedA);

        //b)
        //[1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5]
        List<Integer> generatedB = numbers.stream()
                .flatMapToInt(n -> IntStream.rangeClosed(1, n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(generatedB);

        //c)
        //[1, 2, 3, 3, 4, 5, 4, 5, 6, 7, 5, 6, 7, 8, 9]
        List<Integer> generatedC = numbers.stream()
                .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(generatedC);

        //d)
        //[1, 2, 3, 4, 5]
        List<Integer> generatedD = numbers.stream()
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        System.out.println(generatedD);
    }
}
