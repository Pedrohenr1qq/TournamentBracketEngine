package data.core;

import java.util.UUID;

/**
 * Represent a team
 */
public class Team {
    private final int id;
    private String name;

    public Team(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
