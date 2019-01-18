package pro.ofitserov.stepik.functionalprogramming.practicallessons.t5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Step {

    /**
     * 2.5 Getting distinct strings
     * Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating). The order of elements in the result list may be any (elements will be sorted by the testing system).
     * If the input list doesn't contain any strings then the result list should be empty.
     * Hints: it is possible to use sets, maps, lists and so on for helping.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * Examples: x -> x; (x) -> { return x; };
     * Sample Input 1:
     * java scala java clojure clojure
     * Sample Output 1:
     * clojure java scala
     * Sample Input 2:
     * the three the three the three an an a
     * Sample Output 2:
     * a an the three
     */

    public static void main(String[] args) {
        DistinctList distinctList = list -> new ArrayList<>(new HashSet<>(list));
        DistinctList distinctList2 = (x) -> x.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList.distinct(Arrays.asList("java", "scala", "java", "clojure", "clojure")));
        System.out.println(distinctList.distinct(Arrays.asList("the", "three", "the", "three", "the", "three", "an", "an", "a")));
    }
}
