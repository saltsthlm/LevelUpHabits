package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private int currentLevel = 0;
    private int totalXP = 0;


    private List<Habit> habits = new ArrayList<>();

    public User(String name){
        this.name = name;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getTotalXP() {
        return totalXP;
    }

    public List<Habit> getHabits() {
        return habits;
    }

    public void updateTotalXP(int xp) {
        this.totalXP += xp;
    }

    public void updateCurrentLevel(int level) {
        this.currentLevel = level;
    }

    public void addHabits(Habit habit) {
        habits.add(habit);
    }

    public void removeHabits(Habit habit) {
        habits.remove(habit);
    }
}
