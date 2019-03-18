package pro.ofitserov.stepik.functionalprogramming.practicallessons.t25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2.25 Choose the existing collectors
 * Choose all existing collectors in Java 8 (do not consider parameters, choose only by name).
 */
public class Step1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("s1", "s2", "s3", "s4", "s5");

        // Collectors.toMap()
        System.out.println(list.stream().collect(Collectors.toMap(s1 -> s1.charAt(1), s1 -> s1)));

        // Collectors.toList()
        System.out.println(list.stream().collect(Collectors.toList()));

        // Collectors.toCollection()
        //System.out.println(list.stream().collect(Collectors.toCollection(HashSet::new)));

        // Collectors.toSet()
        System.out.println(list.stream().collect(Collectors.toSet()));

        // Collectors.toConcurrentMap()
        System.out.println(list.stream().collect(Collectors.toConcurrentMap(s1 -> s1.charAt(1), s1 -> s1)));

        // Collectors.toConcurrentQueue()
        // don't exist

        // Collectors.toHashtable()
        // don't exist

        // Collectors.toArrayList()
        // don't exist

    }
}
