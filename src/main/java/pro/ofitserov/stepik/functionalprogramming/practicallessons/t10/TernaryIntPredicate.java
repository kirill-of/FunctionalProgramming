package pro.ofitserov.stepik.functionalprogramming.practicallessons.t10;

@FunctionalInterface
interface TernaryIntPredicate {
    boolean test(int a, int b, int c);
}