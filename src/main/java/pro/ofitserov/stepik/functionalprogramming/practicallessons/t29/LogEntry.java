package pro.ofitserov.stepik.functionalprogramming.practicallessons.t29;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * There is a LogEntry class for monitoring user activity on your site. The class has three fields:
 * created: Date - the date of creating log entry
 * login: String - a user login
 * url: String - a url that the user clicked
 * The class have getters for all fields with the corresponding names (getCreated(), getLogin(), getUrl()).
 */
@Data
@AllArgsConstructor
public class LogEntry {
    private Date created;
    private String login;
    private String url;
}
