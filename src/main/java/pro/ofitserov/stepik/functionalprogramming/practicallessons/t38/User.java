package pro.ofitserov.stepik.functionalprogramming.practicallessons.t38;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User (login: String, account: Account)
 */
@Data
@AllArgsConstructor
public class User {
    String login;
    Account account;
}
