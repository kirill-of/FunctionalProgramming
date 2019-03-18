package pro.ofitserov.stepik.functionalprogramming.practicallessons.t28;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Account: number: String, balance: Long
 */
@Data
@AllArgsConstructor
class Account {
    private String number;
    private Long balance;
}
