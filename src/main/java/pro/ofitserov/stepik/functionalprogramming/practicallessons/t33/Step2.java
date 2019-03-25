package pro.ofitserov.stepik.functionalprogramming.practicallessons.t33;

import java.util.function.Function;

/**
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string following the rules:
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 * Solution format. You may write the result in any valid formats but with ; on the end.
 * <p>
 * An example of a curried function: x -> y -> ...;
 * <p>
 * Sample Input 1:
 * aa bb cc dd
 * Sample Output 1:
 * aaCCbbDD
 * <p>
 * Sample Input 2:
 * AAA bbb CCC ddd
 * Sample Output 2:
 * aaaCCCbbbDDD
 */
public class Step2 {
    public static void main(String[] args) {
        Function<String, Function<String, Function<String, Function<String, String>>>> ffff = (String first) -> (String second) -> (String third) -> (String fourth) -> first.toLowerCase() + third.toUpperCase() + second.toLowerCase() + fourth.toUpperCase();

        Function<String, Function<String, Function<String, Function<String, String>>>> fWithStringBuilder = a -> b -> c -> d -> new StringBuilder(a.toLowerCase())
                .append(c.toUpperCase())
                .append(b.toLowerCase())
                .append(d.toUpperCase())
                .toString();

        System.out.println(fWithStringBuilder.apply("aa").apply("bb").apply("cc").apply("dd"));
        System.out.println(fWithStringBuilder.apply("AAA").apply("bbb").apply("CCC").apply("ddd"));

        System.out.println(fWithStringBuilder.apply("aa").apply("bb").apply("cc").apply("dd"));
        System.out.println(fWithStringBuilder.apply("AAA").apply("bbb").apply("CCC").apply("ddd"));
    }
}
