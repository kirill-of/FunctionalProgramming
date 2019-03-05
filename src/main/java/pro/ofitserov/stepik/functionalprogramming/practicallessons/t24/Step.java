package pro.ofitserov.stepik.functionalprogramming.practicallessons.t24;

import pro.ofitserov.stepik.functionalprogramming.practicallessons.Utils;

import java.util.List;

/**
 * You have two classes:
 * <p>
 * Transaction: uuid: String,  state: State (CANCELED, FINISHED, PROCESSING), sum: Long, created: Date
 * Account: number: String, balance: Long, transactions: List<Transaction>
 * Both classes have getters for all fields with the corresponding names (getState(), getSum(), getTransactions() and so on).
 * Write a method using Stream API that calculates the total sum of canceled transactions for all non-empty accounts (balance > 0). Perhaps, flatMap method can help you to implement it.
 * <p>
 * <p>
 * Classes Transaction, Account and enum State will be available during testing. You can define your own classes for local testing.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an argument and the returned value. Please, use only Stream API, no cycles.
 * <p>
 * Examples: there are 2 accounts (in JSON notation) below. The result is 10 000.
 */

public class Step {

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */
    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        // write your code here
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .map(Transaction::getSum)
                .reduce(0L, (sum, elem) -> sum + elem);
    }

    public static void main(String[] args) throws Exception {
        List<Account> accounts = Utils.getListFromJSON("src\\main\\java\\pro\\ofitserov\\stepik\\functionalprogramming\\practicallessons\\t24\\examples.json", Account.class);
        System.out.println(accounts);

        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));

    }
}
