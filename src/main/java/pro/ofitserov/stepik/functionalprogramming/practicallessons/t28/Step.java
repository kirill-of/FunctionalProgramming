package pro.ofitserov.stepik.functionalprogramming.practicallessons.t28;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingLong;

/**
 * 2.28 Almost like a SQL: the total sum of transactions by each account
 * <p>
 * You have two classes:
 * Account: number: String, balance: Long
 * Transaction: uuid: String, sum: Long, account: Account
 * Both classes have getters for all fields with the corresponding names (getNumber(), getSum(), getAccount() and so on).
 * Write a collector that calculates the total sum of transactions (long type, not integer) by each account (i.e. by account number). The collector will be applied to a stream of transactions.
 * <p>
 * Classes Transaction and Account will be available during testing. You can create your own classes for local testing.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 * <p>
 * List<Transaction> transactions = ...
 * Map<String, Long> totalSumOfTransByEachAccount =
 * transactions.stream()
 * .collect(...your_collector_will_be_passed_here...);
 * <p>
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...)
 */
public class Step {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("530012", 3333L),
                new Account("771843", 15000L),
                new Account("234465", 12000L),
                new Account("110011", 8800L),
                new Account("462181", 45000L),
                new Account("681891", 0L));

        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", 1L, accounts.get(0)),
                new Transaction("2", 12L, accounts.get(1)),
                new Transaction("3", 13L, accounts.get(2)),
                new Transaction("4", 14L, accounts.get(3)),
                new Transaction("5", 15L, accounts.get(1)),
                new Transaction("6", 16L, accounts.get(2)),
                new Transaction("7", 17L, accounts.get(0)),
                new Transaction("8", 18L, accounts.get(4)));

        Map<String, Long> totalSumOfTransByEachAccount = transactions.stream()
                .collect(Collectors.groupingBy((Transaction t) -> t.getAccount().getNumber(), summingLong(Transaction::getSum)));

        System.out.println(totalSumOfTransByEachAccount);
    }
}
