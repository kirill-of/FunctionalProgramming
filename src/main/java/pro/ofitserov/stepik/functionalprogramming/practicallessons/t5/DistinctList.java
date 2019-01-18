package pro.ofitserov.stepik.functionalprogramming.practicallessons.t5;

import java.util.List;

@FunctionalInterface
interface DistinctList {

    List<String> distinct(List<String> list);

}
