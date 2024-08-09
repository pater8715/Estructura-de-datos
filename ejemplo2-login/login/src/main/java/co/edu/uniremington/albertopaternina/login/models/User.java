package co.edu.uniremington.albertopaternina.login.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
     private Long id;
     private String name;
     private String lastname;
     private String age;
     private String email;
     private String address;
     private String username;
     private String password;
}
