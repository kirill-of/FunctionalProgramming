package pro.ofitserov.stepik.functionalprogramming.practicallessons.t38;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

/**
 * Account (guid: UUID, balance: long)
 */
@Data
@AllArgsConstructor
public class Account {
    private long balance;
    private UUID guid;
}
