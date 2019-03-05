package pro.ofitserov.stepik.functionalprogramming.practicallessons.t24;

import lombok.Data;

import java.util.List;

@Data
class Account {
    private String number;
    private Long balance;
    private List<Transaction> transactions;
}
