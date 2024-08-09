package co.edu.uniremington.albertopaternina.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uniremington.albertopaternina.login.models.User;
import co.edu.uniremington.albertopaternina.login.services.RegistreImpl;

@Controller
@RequestMapping("/form")
public class FormController {

    private final RegistreImpl registre;
    private User user_registre;

    @Autowired
    public FormController(RegistreImpl registre){
        this.registre = registre;
    }

     @GetMapping({"/registration", "/" , ""})
    public String form(Model user) {
        this.user_registre = new User();
        user.addAttribute("user_registre", user_registre);
        return "form/registration";
    }

    @GetMapping("/result")
    public String form2(Model user) {
        user.addAttribute("user", this.user_registre);
        return "form/registration-result";
    }

    @PostMapping("/registration")
    public String postMethodName(@ModelAttribute("user_registre") User user) {
        if (user != null) {
            this.user_registre = user;
            registre.registreUser(user);
            return "redirect:/form/result";
        } else {
            System.out.println("Could not register");
            return "redirect:/form";
        }

    }

}
