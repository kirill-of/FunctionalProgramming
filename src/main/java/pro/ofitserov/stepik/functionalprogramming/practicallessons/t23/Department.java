package pro.ofitserov.stepik.functionalprogramming.practicallessons.t23;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    String name;
    String code;
    List<Employee> employees;
}
