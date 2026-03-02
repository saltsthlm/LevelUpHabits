package org.example;

import java.util.List;

public class User {
    private final String name;
    private int currentLevel = 0;
    private int totalXP = 0;
    private List<Habit> habits;

    public User(String name){
        this.name = name;
    }


}
