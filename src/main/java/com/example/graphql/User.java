package com.example.graphql;

public class User {
    private String name;

    // Construtor padrão (vazio) - essencial para o 'new User()' funcionar
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
