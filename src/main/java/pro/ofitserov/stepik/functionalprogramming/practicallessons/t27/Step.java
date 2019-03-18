package pro.ofitserov.stepik.functionalprogramming.practicallessons.t27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 2.27 Collectors in practice: partitioning words into groups
 * <p>
 * Write a collector that partitions all words in a stream into two groups: palindromes (true) and usual words (false). The collector should return Map<Boolean, List<String>>. All input words will be in the same case (lower).
 * <p>
 * Let's remind, a palindrome is a word or phrase which reads the same backward or forward, such as noon or level. In our case, a palindrome is always a word. For details, see https://en.wikipedia.org/wiki/Palindrome
 * <p>
 * Hint: the method reverse() of StringBuilder may help you.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an ﻿argument to the collect() method of a stream as shown below.
 * <p>
 * String[] words = ...
 * Map<Boolean, List<String>> palindromeOrNoMap =
 * Arrays.stream(words)
 * .collect(...your_collector_will_be_passed_here...);
 * <p>
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...)
 * Sample Input 1:
 * aaaa aaa a aa
 * Sample Output 1:
 * {false=[], true=[aaaa, aaa, a, aa]}
 * <p>
 * Sample Input 2:
 * level bbaa ac
 * Sample Output 2:
 * {false=[bbaa, ac], true=[level]}
 */
public class Step {
    public static void main(String[] args) {

        Collector collector = Collectors.partitioningBy((String s) -> s.equals(new StringBuilder(s).reverse().toString()));

        String[] words1 = new String[]{"aaaa", "aaa", "a", "aa"};
        System.out.println(Arrays.stream(words1).collect(collector));

        String[] words2 = new String[]{"level", "bbaa", "ac"};
        System.out.println(Arrays.stream(words2).collect(collector));
    }
}
