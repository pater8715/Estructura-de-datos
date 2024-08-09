package co.edu.uniremington.albertopaternina.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.uniremington.albertopaternina.login.models.User;
import co.edu.uniremington.albertopaternina.login.services.RegistreImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {

    private final RegistreImpl registre;

    @Autowired
    public LoginController(RegistreImpl registre) {
        this.registre = registre;
    }

    @GetMapping({ "/login", "/" })
    public String login(Model user) {
        User userDao = new User();
        user.addAttribute("user", userDao);
        return "login";
    }

    @PostMapping("/login")
    public String authenticate(@ModelAttribute("user") User user) {
            return "redirect:/login";
    }

}
