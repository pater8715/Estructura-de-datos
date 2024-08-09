package co.edu.uniremington.albertopaternina.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/dashboard")
public class DashboardController {

@GetMapping("/admin/{user}")
public String admin(@RequestParam String param) {
    return "home-authentic";
}

@GetMapping("/user")
public String user(@RequestParam String param) {
    return new String();
}


}
