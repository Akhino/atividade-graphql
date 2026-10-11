package com.example.graphql;

import java.util.List;

public interface Character {
    String getId();
    String getName();
    List<String> getAppearsIn();
}
