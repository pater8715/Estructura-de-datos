package co.edu.uniremington.albertopaternina.login.models;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Registre {
    private int id;
    private Map<Integer, User> user;

    public User getUserByUsername(String username) {
        return user.values().stream()
            .filter(u -> u.getUsername().equals(username))
            .findFirst()
            .orElse(null);
    }
}
