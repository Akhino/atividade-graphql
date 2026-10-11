package com.example.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class StarWarController {

    // ==========================================
    // QUERIES
    // ==========================================

    @QueryMapping
    public List<Human> humans() {
        return List.of(
            new Human("1001", "Luke Skywalker", List.of("NEWHOPE"), 1.75f),
            new Human("1002", "Han Solo", List.of("EMPIRE"), 1.80f)
        );
    }

    @QueryMapping
    public List<Starship> starships() {
        return List.of(
            new Starship("3000", "Millenium Falcon", 34.37f),
            new Starship("3001", "X-Wing", 12.5f)
        );
    }

    @QueryMapping
    public Character character(@Argument String id) {
        if ("1001".equals(id)) {
            return new Human("1001", "Luke Skywalker", List.of("NEWHOPE"), 1.75f);
        }
        return new Droid(id, "R2-D2", "Astromech"); 
    }

    // ==========================================
    // MUTATIONS
    // ==========================================

    @MutationMapping
    public Human createHuman(@Argument String id, @Argument String name, @Argument Float height) {
        return new Human(id, name, List.of("NEWHOPE"), height);
    }

    @MutationMapping
    public Droid createDroid(@Argument String id, @Argument String name, @Argument String primaryFunction) {
        return new Droid(id, name, primaryFunction); 
    }

    @MutationMapping
    public Starship createStarship(@Argument String id, @Argument String name, @Argument Float length) {
        return new Starship(id, name, length);
    }

    @MutationMapping
    public Character addFriend(@Argument String characterId, @Argument String friendId) {
        return new Human(characterId, "Luke Skywalker", List.of("NEWHOPE"), 1.75f);
    }
}
