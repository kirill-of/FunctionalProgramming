package pro.ofitserov.stepik.functionalprogramming.practicallessons.t16;

import java.util.stream.LongStream;

public class Step1 {
    /**
     * 2.16 Matching
     * What does this code print?
     */

    public static void main(String[] args) {

        boolean result = LongStream
                .rangeClosed(1, 100_000)
                .anyMatch(val -> val == 100_000);

        System.out.println(result);
        //true
    }
}
