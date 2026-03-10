package ru.netology.SpringBootRest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.SpringBootRest.services.Authorities;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> tmpAuthorities = new ArrayList<>();

        if (user.equals("adm") && password.equals("1234")) {
            tmpAuthorities.add(Authorities.WRITE);
            tmpAuthorities.add(Authorities.READ);
        }

        return tmpAuthorities;
    }
}
