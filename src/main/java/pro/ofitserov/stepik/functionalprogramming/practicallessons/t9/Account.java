package pro.ofitserov.stepik.functionalprogramming.practicallessons.t9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    /**
     * You have a class Account (number: String, balance: Long, isLocked: boolean)
     * The class Account has the next methods: getNumber(), getBalance(), isLocked() for getting the values of the corresponding fields.
     */
    String number;
    Long balance;
    boolean isLocked;
}
