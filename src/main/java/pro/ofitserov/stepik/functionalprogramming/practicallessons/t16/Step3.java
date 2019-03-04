package pro.ofitserov.stepik.functionalprogramming.practicallessons.t16;

import java.util.stream.IntStream;

public class Step3 {
    /**
     * 2.16 Matching
     * What does this code print?
     */

    public static void main(String[] args) {

        boolean result = IntStream
                .iterate(0, n -> n + 1)
                .limit(100)
                .filter(n -> n % 2 != 0)
                .noneMatch(n -> n % 2 == 0);

        System.out.println(result);
        //true
    }
}