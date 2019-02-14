package pro.ofitserov.stepik.functionalprogramming.practicallessons.t9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Step {

    /**
     * 2.9 Behaviour parametrization with lambda expressions
     * You have a class Account (number: String, balance: Long, isLocked: boolean), the list accounts of type List<Account> and the method filter(List<T> elems, Predicate<T> predicate) for filtering the given list of type T by the predicate.
     * The class Account has the next methods: getNumber(), getBalance(), isLocked() for getting the values of the corresponding fields.
     * <p>
     * Write a code for filtering the accounts list in two ways:
     * <p>
     * get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
     * get all non-locked accounts with too much money (balance >= 100 000 000) and save it to the variable accountsWithTooMuchMoney
     * The class Account, the list accounts (List<Account>) and the method filter(...) will be available during testing.
     * <p>
     * Important. Use the given code template for your solution. Do not change it!
     * <p>
     * Example of use the filter method. The code below gets only even number from the list.
     * <p>
     * List<Integer> numbers = ...
     * List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
     * <p>
     * PS: it's often called behaviour parametrization because behaviour of the method filter is dependent of the given predicate.
     */

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("1", -1L, false));
        accounts.add(new Account("2", 1L, false));
        accounts.add(new Account("3", 44L, false));
        accounts.add(new Account("4", 100_000_000L, false));
        accounts.add(new Account("5", 100_000_000L, true));

        // you need to filter List<Account> accounts
        List<Account> nonEmptyAccounts = filter(accounts, account -> account.getBalance() > 0);
        List<Account> accountsWithTooMuchMoney = filter(accounts, account -> account.getBalance() >= 100_000_000 && !account.isLocked());

        System.out.println("nonEmptyAccounts: " + nonEmptyAccounts);
        System.out.println("accountsWithTooMuchMoney: " + accountsWithTooMuchMoney);

    }

    private static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        return elems.stream().filter(predicate).collect(Collectors.toList());
    }
}
