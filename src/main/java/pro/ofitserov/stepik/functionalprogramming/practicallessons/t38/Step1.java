package pro.ofitserov.stepik.functionalprogramming.practicallessons.t38;

import java.util.*;

/**
 * 2.38 Optional in action
 * You need to write a method findUserByLogin(String login) that returns an optional value of type Optional<User>.
 * If the user exists in the users set you need to return non-empty optional wrapping the user inside, otherwise returned optional should be empty.
 * Important. Use the provided template for your solution. Do not change it!
 */
public class Step1 {

    private static final Set<User> users = new HashSet<>();

    public static Optional<User> findUserByLogin(String login) {
        return users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst();


//        for (User user : users) {
//            if (login.equals(user.login)) {
//                return Optional.of(user);
//            }
//        }
//        return Optional.empty();
    }

    public static void main(String[] args) {
        users.add(new User("1", new Account(0, UUID.randomUUID())));
        users.add(new User("2", new Account(0, UUID.randomUUID())));
        users.add(new User("3", new Account(0, UUID.randomUUID())));
        users.add(new User("4", new Account(0, UUID.randomUUID())));
        users.add(new User("5", new Account(0, UUID.randomUUID())));

        System.out.println(findUserByLogin("1"));
    }
}
