package pro.ofitserov.stepik.functionalprogramming.practicallessons.t25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2.25 Choose the existing collectors
 * Choose all existing collectors in Java 8 (don't consider parameters, choose only by name).
 */
public class Step2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Collectors.reducing()
        //System.out.println(list.stream().collect(Collectors.reducing("", Integer::toString, String::concat)));

        // Collectors.partitioningBy()
        System.out.println(list.stream().collect(Collectors.partitioningBy(i -> i > 2)));

        // Collectors.groupingBy()
        System.out.println(list.stream().collect(Collectors.groupingBy(i -> i)));

        // Collectors.maxBy()
        System.out.println(list.stream().collect(Collectors.maxBy(Integer::compareTo)));

        // Collectors.summingDouble()
        System.out.println(list.stream().collect(Collectors.summingDouble(i -> i * 1.0)));

        // Collectors.splittingBy()
        // don't exist

        // Collectors.avgBy()
        // don't exist
    }
}
