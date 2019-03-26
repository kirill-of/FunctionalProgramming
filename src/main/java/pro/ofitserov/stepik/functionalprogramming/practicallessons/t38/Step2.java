package pro.ofitserov.stepik.functionalprogramming.practicallessons.t38;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * 2.38 Optional in action
 * Using the method you wrote for finding an user by their login, write a new method printBalanceIfNotEmpty(String userLogin)that prints an account balance for an existing user if `balance > 0`. In this case, the result format should print the string:
 * login: balance
 * If the user is not found, account is null or the balance = 0, then the method should not print anything.
 * Do not forget to use optional for avoiding NPE.
 */
public class Step2 {

    private static final Set<User> users = new HashSet<>();

    public static void printBalanceIfNotEmpty(String userLogin) {
        findUserByLogin(userLogin)
                .map(User::getAccount)
                .map(Account::getBalance)
                .filter(balance -> balance > 0)
                .ifPresent(balance -> System.out.println(userLogin + ": " + balance));
    }

    public static Optional<User> findUserByLogin(String login) {
        return users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst();
    }

    public static void main(String[] args) {
        Account account = new Account(0, UUID.randomUUID());
        users.add(new User("1", new Account(0, UUID.randomUUID())));
        users.add(new User("2", new Account(1, UUID.randomUUID())));
        users.add(new User("3", new Account(-2, UUID.randomUUID())));
        users.add(new User("4", new Account(500, UUID.randomUUID())));
        users.add(new User("5", new Account(-850, UUID.randomUUID())));

        printBalanceIfNotEmpty("4");
    }

}
