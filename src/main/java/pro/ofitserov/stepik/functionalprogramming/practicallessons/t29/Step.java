package pro.ofitserov.stepik.functionalprogramming.practicallessons.t29;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * 2.29 Almost like a SQL: click count
 * <p>
 * There is a LogEntry class for monitoring user activity on your site. The class has three fields:
 * created: Date - the date of creating log entry
 * login: String - a user login
 * url: String - a url that the user clicked
 * The class have getters for all fields with the corresponding names (getCreated(), getLogin(), getUrl()).
 * <p>
 * Write a collector that calculates how many times was clicked each url by users. The collector will be applied to a stream of log entries for creating a map: url -> click count.
 * <p>
 * The class LogEntry will be available during testing. You can create your own classes for local testing.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 * <p>
 * List<LogEntry> logs = ...
 * Map<String, Long> clickCount =
 * logs.stream()
 * .collect(...your_collector_will_be_passed_here...);
 * <p>
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...).
 */

public class Step {
    public static void main(String[] args) {
        List<LogEntry> logs = Arrays.asList(
                new LogEntry(new Date(), "user1", "url1"),
                new LogEntry(new Date(), "user2", "url1"),
                new LogEntry(new Date(), "user1", "url1"),
                new LogEntry(new Date(), "user2", "url2"),
                new LogEntry(new Date(), "user1", "url3"),
                new LogEntry(new Date(), "user2", "url3")
        );

        Map<String, Long> clickCount =
                logs.stream().collect(Collectors.groupingBy(LogEntry::getUrl, counting()));

        System.out.println(clickCount);
    }
}
