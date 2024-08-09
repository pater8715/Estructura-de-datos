package co.edu.uniremington.albertopaternina.login.services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.edu.uniremington.albertopaternina.login.models.Registre;
import co.edu.uniremington.albertopaternina.login.models.User;
import co.edu.uniremington.albertopaternina.login.models.dao.RegistreDao;
import jakarta.annotation.PostConstruct;
import lombok.Getter;


@Getter
@Service
public class RegistreImpl implements RegistreDao{

    private Registre usersRegistration;

    @PostConstruct
    public void init() {
        this.usersRegistration = new Registre();
        this.usersRegistration.setUser(new HashMap<>());
        this.usersRegistration.setId(0);
    }

    @Override
    public void registreUser(User user) {
        this.usersRegistration.setId(this.usersRegistration.getId()+1);
        this.usersRegistration.getUser().put(this.usersRegistration.getId(), user);
    }

}
