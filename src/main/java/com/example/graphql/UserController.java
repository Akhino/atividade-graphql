package com.example.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @QueryMapping
    public User me() {
        User user = new User();
        user.setName("Usuário Logado");
        return user;
    }
}
