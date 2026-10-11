package com.example.graphql;

public class Starship {
    private String id;
    private String name;
    private Float length;

    public Starship(String id, String name, Float length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public Float getLength() { return length; }
}
