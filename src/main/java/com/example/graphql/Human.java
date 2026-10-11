package com.example.graphql;

import java.util.List;

public class Human implements Character {
    private String id;
    private String name;
    private List<String> appearsIn;
    private Float height;

    public Human(String id, String name, List<String> appearsIn, Float height) {
        this.id = id;
        this.name = name;
        this.appearsIn = appearsIn;
        this.height = height;
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getAppearsIn() { return appearsIn; }
    public Float getHeight() { return height; }
}
