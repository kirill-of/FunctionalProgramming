package pro.ofitserov.stepik.functionalprogramming.practicallessons.t19;

import java.util.stream.IntStream;

public class Step {

    /**
     * You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers. Create the third stream that contains numbers from both streams which is divisible by 3 and 5. After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers. Two first suitable numbers in the sorted list must be skipped.
     * Important. You need return a prepared IntStream from a template method, not a list of integers. Pay attention to the method template. Do not change the signature of this method.
     * Sample Input 1:
     * 1 2 3 4
     * Sample Output 1:
     * []
     * Sample Input 2:
     * 30 75 60 90
     * Sample Output 2:
     * [75, 90]
     */

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)
                .filter(i -> (i % 3 == 0 && i % 5 == 0))
                .sorted()
                .skip(2);
    }

    public static void main(String[] args) {
        createFilteringStream(IntStream.of(2, 4), IntStream.of(1, 3)).forEach(System.out::println);
        createFilteringStream(IntStream.of(30, 60, 90), IntStream.of(75)).forEach(System.out::println);
    }
}
