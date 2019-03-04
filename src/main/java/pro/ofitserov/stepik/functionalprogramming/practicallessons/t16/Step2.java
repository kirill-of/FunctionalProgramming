package pro.ofitserov.stepik.functionalprogramming.practicallessons.t16;

import java.util.stream.IntStream;

public class Step2 {
    /**
     * 2.16 Matching
     * What does this code print?
     */

    public static void main(String[] args) {

        boolean result = !IntStream
                .generate(() -> 100)
                .limit(101)
                .allMatch(val -> val >= 100);

         System.out.println(result);
        //false
    }
}