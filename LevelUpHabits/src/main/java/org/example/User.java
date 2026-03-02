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

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getTotalXP() {
        return totalXP;
    }

    public List<Habit> getHabits() {
        return habits;
    }

    public void updateTotalXP(int totalXP) {
        this.totalXP += totalXP;
    }

    public void updateCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void addHabits(Habit habit) {
        habits.add(habit);
    }

    public void removeHabits(Habit habit) {
        habits.remove(habit);
    }
}
