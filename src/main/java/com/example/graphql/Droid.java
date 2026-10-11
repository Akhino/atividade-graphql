package com.example.graphql;

import java.util.List;

public class Droid implements Character {
    private String id;
    private String name;
    private List<String> appearsIn;
    private String primaryFunction;

    public Droid(String id, String name, String primaryFunction) {
        this.id = id;
        this.name = name;
        this.primaryFunction = primaryFunction;
        this.appearsIn = List.of("NEWHOPE", "EMPIRE", "JEDI");
    }

    @Override
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    @Override
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public List<String> getAppearsIn() { return appearsIn; }
    public void setAppearsIn(List<String> appearsIn) { this.appearsIn = appearsIn; }

    public String getPrimaryFunction() { return primaryFunction; }
    public void setPrimaryFunction(String primaryFunction) { this.primaryFunction = primaryFunction; }
}
