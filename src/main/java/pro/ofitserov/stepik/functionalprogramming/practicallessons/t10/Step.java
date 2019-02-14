package pro.ofitserov.stepik.functionalprogramming.practicallessons.t10;

public class Step {
    /**
     * 2.10 Your own functional interface
     * You need to write your own functional interface (TernaryIntPredicate) and use it with a lambda expression. The interface must have a single non-static (and non-default) method test with three int arguments that returns boolean value.
     * <p>
     * Besides, you need to write a lambda expression with three int arguments using your TernaryIntPredicate.
     * <p>
     * The lambda expression has to return true if all passed values are different otherwise false. The name of the instance is allValuesAreDifferentPredicate. It should be a static field.
     * <p>
     * Important. Use the provided template for your solution. Do not change it!
     * Sample Input 1:
     * <p>
     * 1 1 1
     * Sample Output 1:
     * False
     * Sample Input 2:
     * 2 3 4
     * Sample Output 2:
     * True
     */

    public static void main(String[] args) {
        printMyPredicate(allValuesAreDifferentPredicate, 1, 1, 1);
        printMyPredicate(allValuesAreDifferentPredicate, 2, 3, 4);
    }

    private static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> (a != b) && (b != c) && (c != a);


    private static void printMyPredicate(TernaryIntPredicate t, int a, int b, int c) {
        System.out.println(t.test(a, b, c));
    }
}
