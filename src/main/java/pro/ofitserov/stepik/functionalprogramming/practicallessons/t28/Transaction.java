package pro.ofitserov.stepik.functionalprogramming.practicallessons.t28;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Transaction: uuid: String, sum: Long, account: Account
 */
@Data
@AllArgsConstructor
class Transaction {
    private String uuid;
    private Long sum;
    private Account account;
}
