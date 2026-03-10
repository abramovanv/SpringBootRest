package ru.netology.SpringBootRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringBootRest.services.Authorities;
import ru.netology.SpringBootRest.services.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service; //= new AuthorizationService();

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @GetMapping("/name")
    public String getName() {
        return "Привет";
    }


}
