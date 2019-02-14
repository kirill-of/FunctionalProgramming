package pro.ofitserov.stepik.functionalprogramming.practicallessons.t12;

import java.util.List;
import java.util.function.IntPredicate;

public class Step {
    /**
     * 2.12 Composing predicates
     * Write the disjunctAll method that accepts a list of IntPredicate's and returns a single IntPredicate. The result predicate is a disjunction of all input predicates.
     * <p>
     * If the input list is empty then the result predicate should return false for any integer value (always false).
     * <p>
     * Important. Pay attention to the provided method template. Do not change it.
     */

    public static void main(String[] args) {

    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(x -> false, IntPredicate::or);
// or
// return predicates.stream().reduce(IntPredicate::or).orElseGet(() -> x -> false);
// or
//        Iterator<IntPredicate> iterator = predicates.iterator();
//        IntPredicate first;
//
//        if (iterator.hasNext()) {
//            first = iterator.next();
//        } else return new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                return false;
//            }
//        };
//
//        IntPredicate result = first;
//
//        while (iterator.hasNext()) {
//            result = result.or(iterator.next());
//        }
//
//        return result;
    }
}
